package com.msr.satish_git_sdk.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/msr/satish_git_sdk/di/AppModule;", "", "()V", "provideApiService", "Lcom/msr/satish_git_sdk/network/ApiService;", "preferenceStorage", "Lcom/msr/satish_git_sdk/secure/BineSharedPreference;", "provideBineSharedPreference", "context", "Landroid/content/Context;", "satish-git-sdk_debug"})
@dagger.Module()
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.msr.satish_git_sdk.secure.BineSharedPreference provideBineSharedPreference(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.msr.satish_git_sdk.network.ApiService provideApiService(@org.jetbrains.annotations.NotNull()
    com.msr.satish_git_sdk.secure.BineSharedPreference preferenceStorage) {
        return null;
    }
    
    public AppModule() {
        super();
    }
}