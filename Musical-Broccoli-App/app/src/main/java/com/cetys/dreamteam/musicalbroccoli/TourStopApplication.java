package com.cetys.dreamteam.musicalbroccoli;

import android.app.Application;
import android.content.Context;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.AppComponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.DaggerAppComponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.SessionSubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.AppModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.NetModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.SessionModule;
import com.cetys.dreamteam.musicalbroccoli.core.models.Session;

/**
 * @Author J. Pichardo on 11/11/2016.
 */

public class TourStopApplication extends Application {

    private AppComponent appComponent;
    private SessionSubcomponent sessionSubcomponent;

    public static TourStopApplication get(Context context) {
        return (TourStopApplication) context.getApplicationContext();
    }

    public void createUserComponent(Session session) {
        sessionSubcomponent = this.appComponent.plus(new SessionModule(session));
    }

    @Override
    public void onCreate() {
        super.onCreate();

        bootstrap();

    }

    private void bootstrap() {
        this.appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule())
                .build();
        this.sessionSubcomponent = appComponent.plus(new SessionModule(new Session()));
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public SessionSubcomponent getSessionSubcomponent() {
        return sessionSubcomponent;
    }
}
