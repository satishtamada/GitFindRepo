package com.msr.git

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SearchView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.msr.git.adapter.RepoAdapter
import com.msr.git.databinding.ActivityMainBinding
import com.msr.git.viewmodel.SplashViewModel
import com.msr.satish_git_sdk.network.model.Item
import com.msr.satish_git_sdk.utils.responseData
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity(), RepoAdapter.OnRepoClickListener {

    private val viewModel: SplashViewModel by viewModels()
    private lateinit var adapter: RepoAdapter
    private lateinit var binding: ActivityMainBinding
    private lateinit var list: ArrayList<Item>
    private var loading = true

    private var pagination = 1

    private var pastVisiblesItems = 0
    private var visibleItemCount: Int = 0
    private var totalItemCount: Int = 0

    private lateinit var mLayoutManager: LinearLayoutManager

    private var searchQuery = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        list = ArrayList()
        adapter = RepoAdapter(list, this, this)
        mLayoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = mLayoutManager
        binding.recyclerView.adapter = adapter

        binding.searchBar.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
                androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String): Boolean {
                loading = true
                list.clear()
                pagination = 1
                searchQuery = p0
                binding.progresBar.visibility = View.VISIBLE
                viewModel.getAppInfo(searchQuery, pagination)
                return false
            }

            override fun onQueryTextChange(p0: String): Boolean {
                searchQuery = p0
                return false
            }
        })


        binding.recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                if (dy > 0) //check for scroll down
                {
                    visibleItemCount = mLayoutManager.childCount
                    totalItemCount = mLayoutManager.itemCount
                    pastVisiblesItems = mLayoutManager.findFirstVisibleItemPosition()
                    if (loading) {
                        if (visibleItemCount + pastVisiblesItems >= totalItemCount) {
                            loading = false
                            viewModel.getAppInfo(searchQuery, pagination)
                        }
                    }
                }
            }
        })

        viewModel.actionResult.observe(this, Observer { result ->
            binding.progresBar.visibility = View.GONE
            run {
                Log.e("here", "$result")
                result?.let {
                    if (it.isOffline) {
                        list.clear()
                        list.addAll(it.serachReponse.items)
                        adapter.notifyDataSetChanged()
                    } else {
                        if (it.serachReponse.items.isEmpty()) {
                            loading = false
                        } else {
                            list.addAll(it.serachReponse.items)
                            loading = true
                            pagination = pagination++
                            adapter.notifyDataSetChanged()
                        }
                    }
                }
            }
        })
    }

    override fun onRepoClicked(model: Item) {
        startActivity(Intent(this, RepoDetailActivity::class.java).putExtra("id", model.id))
    }
}