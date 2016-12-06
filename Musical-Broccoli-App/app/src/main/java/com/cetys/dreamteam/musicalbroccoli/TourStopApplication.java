package com.cetys.dreamteam.musicalbroccoli;

import android.app.Application;
import android.content.Context;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.AppComponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.UserSubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.UserModule;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.UserModel;

/**
 * @Author J. Pichardo on 11/11/2016.
 */

public class TourStopApplication extends Application {

    private AppComponent appComponent;
    private UserSubcomponent userSubcomponent;

    public static TourStopApplication get(Context context) {
        return (TourStopApplication) context.getApplicationContext();
    }

    public void createUserComponent(UserModel userModel) {
        userSubcomponent = this.appComponent.plus(new UserModule(userModel));
    }

    @Override
    public void onCreate() {
        super.onCreate();

        bootstrap();

    }

    private void bootstrap() {
//        this.appComponent = DaggerAppComponent.builder().build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public UserSubcomponent getUserSubcomponent() {
        return userSubcomponent;
    }
}
