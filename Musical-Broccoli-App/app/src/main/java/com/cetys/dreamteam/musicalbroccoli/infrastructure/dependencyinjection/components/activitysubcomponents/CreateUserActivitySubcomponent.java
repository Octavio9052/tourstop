package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.CreateUserActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.CreateUserActivity;

import dagger.Subcomponent;

/**
 * Created by Octavio on 2016/12/04.
 */
@ActivityScope
@Subcomponent(modules = CreateUserActivityModule.class)
public interface CreateUserActivitySubcomponent {
    void inject(CreateUserActivity createUserActivity);
}
