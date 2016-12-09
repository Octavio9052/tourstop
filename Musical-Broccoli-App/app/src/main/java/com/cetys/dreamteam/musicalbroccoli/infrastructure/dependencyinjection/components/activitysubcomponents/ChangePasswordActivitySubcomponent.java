package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.ChangePasswordActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.ChangePasswordActivity;

import dagger.Subcomponent;

/**
 * Created by Octavio on 2016/11/22.
 */
@ActivityScope
@Subcomponent(modules = ChangePasswordActivityModule.class)
public interface ChangePasswordActivitySubcomponent {
    void inject(ChangePasswordActivity changePasswordActivity);
}
