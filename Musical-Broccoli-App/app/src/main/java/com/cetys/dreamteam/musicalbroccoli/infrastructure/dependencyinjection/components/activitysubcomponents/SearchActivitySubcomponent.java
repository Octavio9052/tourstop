package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.SearchActivityModule;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.SearchActivity;

import dagger.Subcomponent;

/**
 * @Author J. Pichardo on 11/23/2016.
 */
@Subcomponent( modules = SearchActivityModule.class )
public interface SearchActivitySubcomponent {
    void inject( SearchActivity searchActivity );
}
