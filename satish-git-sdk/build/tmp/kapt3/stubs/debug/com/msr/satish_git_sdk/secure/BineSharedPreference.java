package com.msr.satish_git_sdk.secure;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u0006J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u0006J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006J\u0016\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0018"}, d2 = {"Lcom/msr/satish_git_sdk/secure/BineSharedPreference;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "sharedpreferences", "Landroid/content/SharedPreferences;", "getSharedpreferences", "()Landroid/content/SharedPreferences;", "setSharedpreferences", "(Landroid/content/SharedPreferences;)V", "get", "key", "getSecure", "save", "", "value", "saveSecure", "Companion", "satish-git-sdk_debug"})
public class BineSharedPreference {
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.Nullable()
    private android.content.SharedPreferences sharedpreferences;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFERENCE_NAME = "com.msr.satish_git_sdk.SharedPrefs";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_TOKEN_HUB = "com.msr.satish_git_sdk.token_hub";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_TOKEN_CLOUD = "com.msr.satish_git_sdk.token_cloud";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_RTOKEN_HUB = "com.msr.satish_git_sdk.rtoken_hub";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_RTOKEN_CLOUD = "com.msr.satish_git_sdk.rtoken_cloud";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_TOKEN_ASSET = "com.msr.satish_git_sdk.token_asset";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_RTOKEN_ASSET = "com.msr.satish_git_sdk.rtoken_asset";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_HUB_IP = "com.msr.satish_git_sdk.hubIP";
    public static final com.msr.satish_git_sdk.secure.BineSharedPreference.Companion Companion = null;
    
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.SharedPreferences getSharedpreferences() {
        return null;
    }
    
    public final void setSharedpreferences(@org.jetbrains.annotations.Nullable()
    android.content.SharedPreferences p0) {
    }
    
    /**
     * Save key-value pair to SharedPreferences
     */
    public final boolean save(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return false;
    }
    
    /**
     * GET Value stored in SharedPreferences using the pre-defined key
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String get(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final boolean saveSecure(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return false;
    }
    
    /**
     * GET Value stored in SharedPreferences using the pre-defined key
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSecure(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @javax.inject.Inject()
    public BineSharedPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/msr/satish_git_sdk/secure/BineSharedPreference$Companion;", "", "()V", "KEY_HUB_IP", "", "KEY_RTOKEN_ASSET", "KEY_RTOKEN_CLOUD", "KEY_RTOKEN_HUB", "KEY_TOKEN_ASSET", "KEY_TOKEN_CLOUD", "KEY_TOKEN_HUB", "PREFERENCE_NAME", "satish-git-sdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}