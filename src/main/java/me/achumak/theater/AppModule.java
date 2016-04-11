package me.achumak.theater;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import io.datakernel.eventloop.Eventloop;
import me.achumak.theater.server.ServerModule;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

final class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        install(new ServerModule());
    }

    @Provides
    @Singleton
    Eventloop eventloop() {
        return new Eventloop();
    }

    @Provides
    @Singleton
    ExecutorService executor() {
        return Executors.newCachedThreadPool();
    }
}
