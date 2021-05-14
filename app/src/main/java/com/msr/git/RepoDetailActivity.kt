package com.msr.git

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.msr.git.databinding.ActivityRepoDetailBinding
import com.msr.git.viewmodel.SplashViewModel
import com.msr.satish_git_sdk.network.model.Item
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class RepoDetailActivity : AppCompatActivity() {
    private val viewModel: SplashViewModel by viewModels()
    private lateinit var binding: ActivityRepoDetailBinding
    private var id = 0;
    private lateinit var item:Item
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.let {
            it.setDisplayHomeAsUpEnabled(true)
            it.title="Repo Info"
        }
        binding = DataBindingUtil.setContentView(this, R.layout.activity_repo_detail)
        id = intent.getIntExtra("id", 0)
        viewModel.getInfo(id)
        viewModel.actionItemInfo.observe(this, Observer {
            this.item=it
            binding.name.text = it.name
            binding.desc.text = it.description
            binding.link.text = "Clone Repo: ${it.cloneUrl}"
            Glide.with(this).load(it.owner.avatarUrl).into(binding.icon)
        })

        binding.link.setOnClickListener {
            if(item!=null) {
                val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(item.htmlUrl))
                startActivity(browserIntent)
            }
        }
    }
}