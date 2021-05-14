package com.msr.satish_git_sdk.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u00a2\u0006\u0002\u0010\nJA\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\"\u0010\f\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/msr/satish_git_sdk/repo/BaseRepository;", "", "()V", "error", "Lcom/msr/satish_git_sdk/utils/Result;", "T", "statusCode", "", "message", "", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/msr/satish_git_sdk/utils/Result;", "getResult", "call", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lretrofit2/Response;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "satish-git-sdk_debug"})
public class BaseRepository {
    
    @org.jetbrains.annotations.Nullable()
    public <T extends java.lang.Object>java.lang.Object getResult(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super retrofit2.Response<T>>, ? extends java.lang.Object> p0, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.msr.satish_git_sdk.utils.Result<? extends T>> p1) {
        return null;
    }
    
    private final <T extends java.lang.Object>com.msr.satish_git_sdk.utils.Result<T> error(java.lang.Integer statusCode, java.lang.String message) {
        return null;
    }
    
    public BaseRepository() {
        super();
    }
}