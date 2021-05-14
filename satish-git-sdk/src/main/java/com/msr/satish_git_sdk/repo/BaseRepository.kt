package com.msr.satish_git_sdk.repo

import com.msr.satish_git_sdk.utils.CustomException
import com.msr.satish_git_sdk.utils.Result
import retrofit2.Response

open class BaseRepository {
     open suspend fun <T> getResult(call: suspend () -> Response<T>): Result<T> {
        try {
            val response = call()
            if (response.isSuccessful) {
                response.body()?.let {
                    return Result.Success(it)
                }
            }
            return error(response.code(), response.message())
        } catch (e: Exception) {
            return error(message = e.message ?: e.toString())
        }
    }

    private fun <T> error(statusCode: Int? = 0, message: String): Result<T> {
        return Result.Error(
            CustomException(
                statusCode,
                "Network call has failed for a following reason: $message"
            )
        )
    }
}