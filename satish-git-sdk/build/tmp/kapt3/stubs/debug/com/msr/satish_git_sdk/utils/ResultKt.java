package com.msr.satish_git_sdk.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\r\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u000e\u001a\u0002H\u0002\u00a2\u0006\u0002\u0010\u000f\u001a)\u0010\u0010\u001a\u00020\u0011\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0013H\u0086\b\"#\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"#\u0010\u0006\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0019\u0010\t\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"error", "Lcom/msr/satish_git_sdk/utils/Result$Error;", "T", "Lcom/msr/satish_git_sdk/utils/Result;", "getError", "(Lcom/msr/satish_git_sdk/utils/Result;)Lcom/msr/satish_git_sdk/utils/Result$Error;", "responseData", "getResponseData", "(Lcom/msr/satish_git_sdk/utils/Result;)Ljava/lang/Object;", "succeeded", "", "getSucceeded", "(Lcom/msr/satish_git_sdk/utils/Result;)Z", "successOr", "fallback", "(Lcom/msr/satish_git_sdk/utils/Result;Ljava/lang/Object;)Ljava/lang/Object;", "updateOnSuccess", "", "liveData", "Landroidx/lifecycle/MutableLiveData;", "satish-git-sdk_debug"})
public final class ResultKt {
    
    public static final boolean getSucceeded(@org.jetbrains.annotations.NotNull()
    com.msr.satish_git_sdk.utils.Result<?> $this$succeeded) {
        return false;
    }
    
    public static final <T extends java.lang.Object>T successOr(@org.jetbrains.annotations.NotNull()
    com.msr.satish_git_sdk.utils.Result<? extends T> $this$successOr, T fallback) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>T getResponseData(@org.jetbrains.annotations.NotNull()
    com.msr.satish_git_sdk.utils.Result<? extends T> $this$responseData) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>com.msr.satish_git_sdk.utils.Result.Error getError(@org.jetbrains.annotations.NotNull()
    com.msr.satish_git_sdk.utils.Result<? extends T> $this$error) {
        return null;
    }
}