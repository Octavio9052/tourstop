package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.LoginActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.ServiceModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.UserModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.LoginActivityModule;

import dagger.Subcomponent;

/**
 * @Author J. Pichardo on 11/11/2016.
 */
@Subcomponent(modules = { UserModule.class, ServiceModule.class})
public interface UserSubcomponent {
    // LoginActivitySubcomponent plus(LoginActivityModule module); -- .getUserSubcomponent.plus
}
