package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.CreateTourActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.CreateTourActivity;

import dagger.Subcomponent;

/**
 * Created by Octavio on 2016/11/23.
 */
@ActivityScope
@Subcomponent(modules = CreateTourActivityModule.class)
public interface CreateTourActivitySubcomponent {
    void inject(CreateTourActivity createTourActivity);
}
