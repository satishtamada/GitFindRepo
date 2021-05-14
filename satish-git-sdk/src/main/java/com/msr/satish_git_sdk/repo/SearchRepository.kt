package com.msr.satish_git_sdk.repo

import com.msr.satish_git_sdk.network.ApiService
import com.msr.satish_git_sdk.network.model.SerachReponse
import com.msr.satish_git_sdk.utils.Result
import javax.inject.Inject

class SearchRepository @Inject constructor(
    private val api: ApiService,
) : BaseRepository() {
    suspend fun getInfo(query: String): Result<SerachReponse?> {
        val inputQuery = "$query in:name"
        val result = getResult { api.getInfo(inputQuery, 10, 1) }
        return result
    }
}