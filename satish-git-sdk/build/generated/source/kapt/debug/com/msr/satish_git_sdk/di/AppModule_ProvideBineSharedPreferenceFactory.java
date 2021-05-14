package com.msr.satish_git_sdk.di;

import android.content.Context;
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
public final class AppModule_ProvideBineSharedPreferenceFactory implements Factory<BineSharedPreference> {
  private final AppModule module;

  private final Provider<Context> contextProvider;

  public AppModule_ProvideBineSharedPreferenceFactory(AppModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public BineSharedPreference get() {
    return provideBineSharedPreference(module, contextProvider.get());
  }

  public static AppModule_ProvideBineSharedPreferenceFactory create(AppModule module,
      Provider<Context> contextProvider) {
    return new AppModule_ProvideBineSharedPreferenceFactory(module, contextProvider);
  }

  public static BineSharedPreference provideBineSharedPreference(AppModule instance,
      Context context) {
    return Preconditions.checkNotNull(instance.provideBineSharedPreference(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
