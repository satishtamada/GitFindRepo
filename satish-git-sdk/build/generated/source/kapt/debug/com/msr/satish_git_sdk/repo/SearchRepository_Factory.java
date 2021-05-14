package com.msr.satish_git_sdk.repo;

import com.msr.satish_git_sdk.network.ApiService;
import dagger.internal.Factory;
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
public final class SearchRepository_Factory implements Factory<SearchRepository> {
  private final Provider<ApiService> apiProvider;

  public SearchRepository_Factory(Provider<ApiService> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public SearchRepository get() {
    return newInstance(apiProvider.get());
  }

  public static SearchRepository_Factory create(Provider<ApiService> apiProvider) {
    return new SearchRepository_Factory(apiProvider);
  }

  public static SearchRepository newInstance(ApiService api) {
    return new SearchRepository(api);
  }
}
