package com.msr.git.viewmodel

import android.content.Context
import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.msr.git.db.GitItemDBRepo
import com.msr.git.di.IoDispatcher
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
    private val _actionResult = SingleLiveEvent<Result<SerachReponse?>>()
    private val _isHubConnected = MutableLiveData<Boolean>()

    val actionResult: LiveData<Result<SerachReponse?>>
        get() = _actionResult

    val isHubConnected: LiveData<Boolean>
        get() = _isHubConnected

    fun getAppInfo(query: String) {
        viewModelScope.launch(ioDispatcher) {
            val call = async {
                repository.getInfo(query)
            }

            when (val result = call.await()) {
                is Result.Success -> {
                    _actionResult.postValue(result)
                    insertRepo(result)
                }
                is Result.Error -> {
                    Log.e("here","${result.exception?.statusCode}")
                    Log.e("here", result.exception.toString())
                }
                is Result.Loading -> {
                    Log.e("here", "Loading")
                }
            }
        }
    }

    private fun insertRepo(result: Result<SerachReponse?>){
        result.let {
            result.responseData?.let {
                for(model in it.items){
                    GitItemDBRepo.insertGitRepo(context,model)
                }
            }
        }
    }
}