// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.zl.weilu.androidut.dagger.base.module;

import com.zl.weilu.androidut.net.LoggingInterceptor;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ClientModule_ProvideLoggingInterceptorFactory
    implements Factory<LoggingInterceptor> {
  private final ClientModule module;

  public ClientModule_ProvideLoggingInterceptorFactory(ClientModule module) {
    this.module = module;
  }

  @Override
  public LoggingInterceptor get() {
    return Preconditions.checkNotNull(
        module.provideLoggingInterceptor(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LoggingInterceptor> create(ClientModule module) {
    return new ClientModule_ProvideLoggingInterceptorFactory(module);
  }

  public static LoggingInterceptor proxyProvideLoggingInterceptor(ClientModule instance) {
    return instance.provideLoggingInterceptor();
  }
}