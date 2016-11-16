package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.ServiceModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.UserModule;

import dagger.Subcomponent;

/**
 * @Author J. Pichardo on 11/11/2016.
 */
@Subcomponent(modules = { UserModule.class, ServiceModule.class})
public interface UserSubcomponent {

}
