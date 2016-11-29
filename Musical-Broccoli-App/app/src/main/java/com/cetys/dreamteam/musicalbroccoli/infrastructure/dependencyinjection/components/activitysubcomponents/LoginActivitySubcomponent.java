package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.ConnectorModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.LoginActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.LoginActivity;

import dagger.Subcomponent;

/**
 * Created by Octavio on 2016/11/21.
 */
@ActivityScope
@Subcomponent( modules = { LoginActivityModule.class, ConnectorModule.class } )
public interface LoginActivitySubcomponent {
    void inject( LoginActivity loginActivity );
}
