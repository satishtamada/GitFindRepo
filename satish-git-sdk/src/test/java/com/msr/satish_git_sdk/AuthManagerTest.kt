package com.msr.satish_git_sdk

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.msr.satish_git_sdk.network.ApiService
import com.msr.satish_git_sdk.network.model.AppInfo
import com.msr.satish_git_sdk.network.model.ResponseModel
import com.msr.satish_git_sdk.network.model.SerachReponse
import com.msr.satish_git_sdk.repo.SearchRepository
import com.msr.satish_git_sdk.repo.BaseRepository
import com.msr.satish_git_sdk.testdi.BaseTest
import com.msr.satish_git_sdk.testdi.MainCoroutineRule
import com.msr.satish_git_sdk.utils.CustomException
import com.msr.satish_git_sdk.utils.Result
import com.msr.satish_git_sdk.utils.error
import com.msr.satish_git_sdk.utils.responseData
import com.nhaarman.mockitokotlin2.whenever
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock
import retrofit2.Response

@ExperimentalCoroutinesApi
@HiltAndroidTest
class AuthManagerTest : BaseTest() {

    // Set the main coroutines dispatcher for unit testing.
    @ExperimentalCoroutinesApi
    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()

    // Executes each task synchronously using Architecture Components.
    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    private lateinit var searchManager: SearchRepository

    @Mock
    var apiService: ApiService? = null

    @Mock
    var baseRepository: BaseRepository? = null


    @Before
    fun setConfig() {
        super.setUp()
        /*val content = AppInfo()
        val responseModel = SerachReponse()
        content.responseModel = responseModel
        val response = Response.success(content)
        val result = Result.Success(content)
        runBlocking {
            whenever(baseRepository?.getResult { response }).thenReturn(result)
            whenever(apiService?.getInfo(10,1)).thenReturn(response)
        }
        apiService?.let {
            searchManager = SearchRepository(it)
        }*/
    }

    @After
    fun setTearDown() {
        super.tearDown()
    }


    /*fun setErrorResponse() {
        val content = AppInfo()
        val customException = CustomException(404, "error")
        val response = Response.success(content)
        val result = Result.Error(customException)
        runBlocking {
            whenever(apiService?.getInfo()).thenReturn(response)
            whenever(baseRepository?.getResult { response }).thenReturn(result)
        }
        apiService?.let {
            searchManager = SearchRepository(it)
        }
    }*/


    /*@Test
    fun `test api is returning response`() =
        runBlocking {
            val response = searchManager.getInfo()
            assert(response.responseData?.responseModel?.numFound == 7)
        }*/

}


