package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.EditUserActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.EditUserActivity;

import dagger.Subcomponent;

/**
 * Created by Octavio on 2016/11/21.
 */

@ActivityScope
@Subcomponent(modules = EditUserActivityModule.class)
public interface EditUserActivitySubcomponent {
    void inject(EditUserActivity editUserActivity);
}
