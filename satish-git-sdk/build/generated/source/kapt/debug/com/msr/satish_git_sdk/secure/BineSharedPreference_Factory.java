package com.msr.satish_git_sdk.secure;

import android.content.Context;
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
public final class BineSharedPreference_Factory implements Factory<BineSharedPreference> {
  private final Provider<Context> contextProvider;

  public BineSharedPreference_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public BineSharedPreference get() {
    return newInstance(contextProvider.get());
  }

  public static BineSharedPreference_Factory create(Provider<Context> contextProvider) {
    return new BineSharedPreference_Factory(contextProvider);
  }

  public static BineSharedPreference newInstance(Context context) {
    return new BineSharedPreference(context);
  }
}
