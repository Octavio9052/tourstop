package com.cetys.dreamteam.musicalbroccoli.presentation.views.activities;

import android.app.Application;
import android.content.Context;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.AppComponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.DaggerAppComponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.UserSubcomponent;

/**
 * @Author J. Pichardo on 11/11/2016.
 */

public class TourStopApplication extends Application {

    private AppComponent appComponent;
    private UserSubcomponent userSubcomponent;

    public static TourStopApplication get( Context context ) {
        return ( TourStopApplication ) context.getApplicationContext();
    }

    public void createUserComponent() {

    }

    private void bootstrap() {
        this.appComponent = DaggerAppComponent.builder().build();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        bootstrap();

    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public UserSubcomponent getUserSubcomponent() {
        return userSubcomponent;
    }
}
