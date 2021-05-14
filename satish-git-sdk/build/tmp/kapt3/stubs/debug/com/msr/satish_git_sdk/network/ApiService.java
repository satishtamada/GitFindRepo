package com.msr.satish_git_sdk.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ7\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/msr/satish_git_sdk/network/ApiService;", "", "getInfo", "Lretrofit2/Response;", "Lcom/msr/satish_git_sdk/network/model/SerachReponse;", "query", "", "perPage", "", "page", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "satish-git-sdk_debug"})
public abstract interface ApiService {
    public static final com.msr.satish_git_sdk.network.ApiService.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "search/repositories")
    public abstract java.lang.Object getInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String query, @retrofit2.http.Query(value = "per_page")
    int perPage, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.msr.satish_git_sdk.network.model.SerachReponse>> p3);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/msr/satish_git_sdk/network/ApiService$Companion;", "", "()V", "BASE_URL", "", "create", "Lcom/msr/satish_git_sdk/network/ApiService;", "preferenceStorage", "Lcom/msr/satish_git_sdk/secure/BineSharedPreference;", "satish-git-sdk_debug"})
    public static final class Companion {
        private static final java.lang.String BASE_URL = "https://api.github.com/";
        
        @org.jetbrains.annotations.NotNull()
        public final com.msr.satish_git_sdk.network.ApiService create(@org.jetbrains.annotations.NotNull()
        com.msr.satish_git_sdk.secure.BineSharedPreference preferenceStorage) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}