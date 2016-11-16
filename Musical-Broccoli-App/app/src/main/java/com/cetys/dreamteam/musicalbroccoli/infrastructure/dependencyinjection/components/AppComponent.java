package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.AppModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.NetModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.UserModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @Author J. Pichardo on 11/11/2016.
 */
@Singleton
@Component(modules = { AppModule.class, NetModule.class})
public interface AppComponent {
    UserSubcomponent plus( UserModule userModule);
}
