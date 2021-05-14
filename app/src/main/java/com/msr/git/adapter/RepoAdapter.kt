package com.msr.git.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.msr.git.R
import com.msr.git.databinding.ItemRepoAdapterBinding
import com.msr.satish_git_sdk.network.model.Item
import java.util.*

class RepoAdapter(
    private val dataModelList: ArrayList<Item>,
    private val context: Context,
    private val listener: OnRepoClickListener
) : RecyclerView.Adapter<RepoAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): ViewHolder {
        val binding: ItemRepoAdapterBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context), R.layout.item_repo_adapter, parent, false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataModel = dataModelList[position]
        holder.bind(dataModel, position)
    }

    override fun getItemCount(): Int {
        return dataModelList.size
    }

    inner class ViewHolder(var itemRowBinding: ItemRepoAdapterBinding) : RecyclerView.ViewHolder(
        itemRowBinding.root
    ) {
        fun bind(model: Item, position: Int) {
            itemRowBinding.title.text = model.name
            itemRowBinding.desc.text = model.description
            itemRowBinding.parent.setOnClickListener {
                listener.onRepoClicked(model)
            }
        }
    }

    interface OnRepoClickListener {
        fun onRepoClicked(model: Item)
    }
}