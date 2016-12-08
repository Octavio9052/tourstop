package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.SearchResultsActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.SearchResultsActivity;

import dagger.Subcomponent;

/**
 * Created by Octavio on 2016/12/04.
 */
@ActivityScope
@Subcomponent(modules = SearchResultsActivityModule.class)
public interface SearchResultsActivitySubcomponent {
    void inject(SearchResultsActivity searchResultsActivity);
}
