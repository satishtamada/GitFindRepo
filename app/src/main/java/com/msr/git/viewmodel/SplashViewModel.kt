package com.msr.git.viewmodel

import android.content.Context
import android.net.ConnectivityManager
import android.util.Log
import androidx.core.content.ContextCompat.getSystemService
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.msr.git.db.GitItemDBRepo
import com.msr.git.di.IoDispatcher
import com.msr.satish_git_sdk.network.model.Item
import com.msr.satish_git_sdk.network.model.ResponseData
import com.msr.satish_git_sdk.network.model.SerachReponse
import com.msr.satish_git_sdk.repo.SearchRepository
import com.msr.satish_git_sdk.secure.BineSharedPreference
import com.msr.satish_git_sdk.utils.Result
import com.msr.satish_git_sdk.utils.SingleLiveEvent
import com.msr.satish_git_sdk.utils.responseData
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.async
import kotlinx.coroutines.launch


class SplashViewModel @ViewModelInject constructor(
        private val repository: SearchRepository,
        private val sharedPreference: BineSharedPreference,
        @ApplicationContext val context: Context,
        @IoDispatcher private val ioDispatcher: CoroutineDispatcher
) : ViewModel() {
    private val _actionResult = SingleLiveEvent<ResponseData?>()
    private val _itemInfo = MutableLiveData<Item>()

    val actionResult: LiveData<ResponseData?>
        get() = _actionResult

    val actionItemInfo: LiveData<Item>
        get() = _itemInfo

    fun getAppInfo(query: String, page: Int) {
        if(!isNetworkConnected())
        getRepos(query)
        viewModelScope.launch(ioDispatcher) {
            val call = async {
                repository.getInfo(query, page)
            }

            when (val result = call.await()) {
                is Result.Success -> {
                    val reponse = ResponseData()
                    reponse.isOffline = false
                    reponse.serachReponse = result.responseData
                    _actionResult.postValue(reponse)
                    insertRepo(result)
                }
                is Result.Error -> {
                    Log.e("here", "${result.exception?.statusCode}")
                    Log.e("here", result.exception.toString())
                }
                is Result.Loading -> {
                    Log.e("here", "Loading")
                }
            }
        }
    }

    private fun insertRepo(result: Result<SerachReponse?>) {
        result.let {
            result.responseData?.let {
                for (model in it.items) {
                    GitItemDBRepo.insertGitRepo(context, model)
                }
            }
        }
    }

    fun getInfo(id: Int) {
        viewModelScope.launch(ioDispatcher) {
            val item = GitItemDBRepo.getRepoInfo(context, id)
            item?.let {
                _itemInfo.postValue(it)
            }
        }
    }

    fun getRepos(query: String) {
        Log.e("here","offline")
        viewModelScope.launch(ioDispatcher) {
            val input="%$query%"
            val item = GitItemDBRepo.getListOfRepo(context, input)
            item?.let {
                val reponse = ResponseData()
                reponse.isOffline = true
                val searchRepo = SerachReponse()
                searchRepo.items = item
                reponse.serachReponse = searchRepo
                _actionResult.postValue(reponse)
            }
        }
    }


    private fun isNetworkConnected(): Boolean {
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
        return cm?.activeNetworkInfo != null && cm.activeNetworkInfo?.isConnected!!
    }
}