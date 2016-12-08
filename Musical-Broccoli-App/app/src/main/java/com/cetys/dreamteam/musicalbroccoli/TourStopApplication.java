package com.cetys.dreamteam.musicalbroccoli;

import android.app.Application;
import android.content.Context;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.AppComponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.DaggerAppComponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.UserSubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.AppModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.NetModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.UserModule;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.Session;

/**
 * @Author J. Pichardo on 11/11/2016.
 */

public class TourStopApplication extends Application {

    private AppComponent appComponent;
    private UserSubcomponent userSubcomponent;

    public static TourStopApplication get(Context context) {
        return (TourStopApplication) context.getApplicationContext();
    }

    public void createUserComponent(Session session) {
        userSubcomponent = this.appComponent.plus(new UserModule(session));
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
        this.userSubcomponent = appComponent.plus(new UserModule(new Session()));
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public UserSubcomponent getUserSubcomponent() {
        return userSubcomponent;
    }
}
