package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.EditUserActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.LoginActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.AppModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.NetModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.UserModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.EditUserActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.LoginActivityModule;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.EditUserActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @Author J. Pichardo on 11/11/2016.
 */
@Singleton
@Component(modules = { AppModule.class, NetModule.class})
public interface AppComponent {
    UserSubcomponent plus( UserModule userModule);
    LoginActivitySubcomponent plus(LoginActivityModule module);
    EditUserActivitySubcomponent plus(EditUserActivityModule module);
}
