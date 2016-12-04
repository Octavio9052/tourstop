package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.MainPageActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.MainPageActivity;

import dagger.Subcomponent;

/**
 * Created by Octavio on 2016/12/03.
 */

@ActivityScope
@Subcomponent(modules = MainPageActivityModule.class)
public interface MainPageActivitySubcomponent {
    void inject(MainPageActivity mainPageActivity);
}
