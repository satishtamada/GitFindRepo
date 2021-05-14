package com.msr.git.db

import android.content.Context
import androidx.lifecycle.LiveData
import com.msr.satish_git_sdk.network.model.Item
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class GitItemDBRepo {
    companion object {
        private var roomHelper: RoomHelper? = null

        private fun intialiseDB(context: Context): RoomHelper? {
            return RoomHelper.getInstance(context)
        }

        fun insertGitRepo(context: Context, sendToUserEntity: Item) {
            roomHelper = intialiseDB(context)
            CoroutineScope(Dispatchers.IO).launch {
                roomHelper?.repoDataDao()?.insertRepo(sendToUserEntity)
            }
        }

        fun getSelectedCheckBox(context: Context): LiveData<List<Item>>? {
            roomHelper = intialiseDB(context)
            return roomHelper?.repoDataDao()?.getRepoList()
        }

    }
}