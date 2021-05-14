package com.msr.git.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.msr.git.db.dao.RepoDataDao
import com.msr.satish_git_sdk.network.model.Item


@Database(entities = [Item::class], version = 1, exportSchema = false)
abstract class RoomHelper : RoomDatabase() {
    abstract fun repoDataDao(): RepoDataDao

    companion object {
        @Volatile
        private var instance: RoomHelper? = null

        fun getInstance(context: Context): RoomHelper? {
            if (instance == null) {
                instance = Room.databaseBuilder(context, RoomHelper::class.java, "mainDb")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build()
            }
            return instance
        }

    }
}