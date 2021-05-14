package com.msr.satish_git_sdk.network

import android.text.TextUtils
import android.util.Log
import com.msr.satish_git_sdk.BuildConfig
import com.msr.satish_git_sdk.network.model.AppInfo
import com.msr.satish_git_sdk.network.model.SerachReponse
import com.msr.satish_git_sdk.secure.BineSharedPreference
import com.msr.satish_git_sdk.utils.Constants
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

interface ApiService {

    @GET("search/repositories")
    suspend fun getInfo(
        @Query("q") query : String,
        @Query("per_page") perPage : Int,
        @Query("page") page: Int
    ): Response<SerachReponse?>

    companion object {
        private const val BASE_URL = BuildConfig.BASE_URL

        fun create(preferenceStorage: BineSharedPreference): ApiService {
            val logger = HttpLoggingInterceptor().apply {
                level = if (BuildConfig.DEBUG)
                    HttpLoggingInterceptor.Level.BODY
                else
                    HttpLoggingInterceptor.Level.NONE
            }

            val client = OkHttpClient.Builder()
                .addInterceptor(logger)
                .addInterceptor { chain ->
                    val newRequest = chain.request().newBuilder()
                        .addHeader("Accept", "application/vnd.github.v3+json")
                        .build()
                    chain.proceed(newRequest)
                }
                .build()

            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
                .create(ApiService::class.java)
        }
    }
}