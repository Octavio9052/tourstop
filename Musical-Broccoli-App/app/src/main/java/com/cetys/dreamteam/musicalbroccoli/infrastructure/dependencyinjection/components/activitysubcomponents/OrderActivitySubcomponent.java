package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.OrderActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.OrderActivity;

import dagger.Subcomponent;

/**
 * Created by Octavio on 2016/12/03.
 */

@ActivityScope
@Subcomponent(modules = OrderActivityModule.class)
public interface OrderActivitySubcomponent {
    void inject(OrderActivity orderActivity);
}
