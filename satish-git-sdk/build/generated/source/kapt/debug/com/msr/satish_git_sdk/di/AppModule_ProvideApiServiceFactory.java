package com.msr.satish_git_sdk.di;

import com.msr.satish_git_sdk.network.ApiService;
import com.msr.satish_git_sdk.secure.BineSharedPreference;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideApiServiceFactory implements Factory<ApiService> {
  private final AppModule module;

  private final Provider<BineSharedPreference> preferenceStorageProvider;

  public AppModule_ProvideApiServiceFactory(AppModule module,
      Provider<BineSharedPreference> preferenceStorageProvider) {
    this.module = module;
    this.preferenceStorageProvider = preferenceStorageProvider;
  }

  @Override
  public ApiService get() {
    return provideApiService(module, preferenceStorageProvider.get());
  }

  public static AppModule_ProvideApiServiceFactory create(AppModule module,
      Provider<BineSharedPreference> preferenceStorageProvider) {
    return new AppModule_ProvideApiServiceFactory(module, preferenceStorageProvider);
  }

  public static ApiService provideApiService(AppModule instance,
      BineSharedPreference preferenceStorage) {
    return Preconditions.checkNotNull(instance.provideApiService(preferenceStorage), "Cannot return null from a non-@Nullable @Provides method");
  }
}
