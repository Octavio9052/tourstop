package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.UserProfileActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.UserProfileActivity;

import dagger.Subcomponent;

/**
 * Created by Octavio on 2016/11/22.
 */

@ActivityScope
@Subcomponent(modules = UserProfileActivityModule.class)
public interface UserProfileActivitySubcomponent {
    void inject(UserProfileActivity userProfileActivity);
}
