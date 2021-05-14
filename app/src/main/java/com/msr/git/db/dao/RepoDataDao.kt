package com.msr.git.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.msr.satish_git_sdk.network.model.Item

@Dao
interface RepoDataDao {

    @Query("SELECT * FROM repo ORDER BY id ASC")
    fun getRepoList(): LiveData<List<Item>>?

    @Query("SELECT * FROM repo WHERE id = :id")
    fun getRepoById(id: Int): LiveData<Item>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRepo(chatDataEntity: Item)

}