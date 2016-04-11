package me.achumak.theater.server;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import io.datakernel.config.Config;
import io.datakernel.eventloop.Eventloop;
import io.datakernel.http.AsyncHttpServer;
import io.datakernel.http.MiddlewareServlet;
import io.datakernel.http.StaticServlet;
import io.datakernel.http.StaticServletForResources;

import java.util.concurrent.ExecutorService;

import static io.datakernel.config.ConfigConverters.ofInteger;
import static io.datakernel.config.ConfigConverters.ofString;

public class ServerModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(StaticServlet.class).to(StaticServletForResources.class);
    }

    @Provides
    @Singleton
    AsyncHttpServer asyncHttpServer(Eventloop eventloop, MiddlewareServlet dispatcher, Config config) {
        AsyncHttpServer server = new AsyncHttpServer(eventloop, dispatcher);
        server.setListenPort(config.get(ofInteger(), "port"));
        return server;
    }

    @Provides
    @Singleton
    MiddlewareServlet dispatcher(StaticServlet staticServlet) {
        MiddlewareServlet dispatcher = new MiddlewareServlet();
        dispatcher.setDefault(staticServlet);
        return dispatcher;
    }

    @Provides
    @Singleton
    StaticServletForResources staticServletForResources(Eventloop eventloop, ExecutorService executor, Config config) {
        return StaticServletForResources.create(eventloop, executor, config.get(ofString(), "staticRoot"));
    }
}
