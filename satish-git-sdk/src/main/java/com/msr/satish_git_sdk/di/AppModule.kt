package com.msr.satish_git_sdk.di

import android.content.Context
import com.msr.satish_git_sdk.network.ApiService
import com.msr.satish_git_sdk.secure.BineSharedPreference
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton


@InstallIn(ApplicationComponent::class)
@Module
class AppModule {

    @Provides
    @Singleton
    fun provideBineSharedPreference(@ApplicationContext context: Context): BineSharedPreference {
        return BineSharedPreference(context)
    }

    @Provides
    fun provideApiService(preferenceStorage: BineSharedPreference): ApiService{
        return ApiService.create(preferenceStorage)
    }

}