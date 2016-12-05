package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.CreatePromotionActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.CreatePromotionActivity;

import dagger.Subcomponent;

/**
 * Created by Octavio on 2016/12/04.
 */
@ActivityScope
@Subcomponent(modules = CreatePromotionActivityModule.class)
public interface CreatePromotionActivitySubcomponent {
    void inject(CreatePromotionActivity createPromotionActivity);
}
