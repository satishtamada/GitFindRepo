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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        list = ArrayList()
        adapter = RepoAdapter(list, this, this)
        binding.recyclerView.adapter = adapter

        binding.searchBar.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
                androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String): Boolean {
                binding.progresBar.visibility = View.VISIBLE
                viewModel.getAppInfo(p0)
                return false
            }

            override fun onQueryTextChange(p0: String): Boolean {
                return false
            }
        })

        viewModel.actionResult.observe(this, Observer { result ->
            binding.progresBar.visibility = View.GONE
            run {
                Log.e("here", "$result")
                result.responseData?.let {
                    list.clear()
                    list.addAll(it.items)
                    if (list.isEmpty()) {
                        binding.recyclerView.visibility = View.GONE
                        binding.nodatafound.visibility = View.VISIBLE
                    } else {
                        adapter.notifyDataSetChanged()
                        binding.recyclerView.visibility = View.VISIBLE
                        binding.nodatafound.visibility = View.GONE
                    }
                }
            }
        })
    }

    override fun onRepoClicked(model: Item) {
        startActivity(Intent(this, RepoDetailActivity::class.java).putExtra("id", model.id))
    }
}