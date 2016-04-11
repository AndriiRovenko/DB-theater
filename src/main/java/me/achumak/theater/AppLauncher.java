package me.achumak.theater;

import com.google.inject.Stage;
import io.datakernel.config.PropertiesConfigModule;
import io.datakernel.launcher.Launcher;
import io.datakernel.service.ServiceGraphModule;

public final class AppLauncher extends Launcher {
    public static void main(String[] args) throws Exception {
        run(AppLauncher.class, args);
    }

    @Override
    protected void configure() {
        injector(Stage.PRODUCTION,
                ServiceGraphModule.defaultInstance(),
                new AppModule(),
                new PropertiesConfigModule("config.properties"));
    }

    @Override
    protected void doRun() throws Exception {
        awaitShutdown();
    }
}
