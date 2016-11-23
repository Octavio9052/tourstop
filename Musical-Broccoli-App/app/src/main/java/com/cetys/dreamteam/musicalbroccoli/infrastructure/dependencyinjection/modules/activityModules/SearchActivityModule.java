package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activityModules;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.SearchViewModelImpl;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.SearchViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.SearchActivity;

import dagger.Module;
import dagger.Provides;

/**
 * @Author J. Pichardo on 11/23/2016.
 */
@Module
public class SearchActivityModule {

    private final SearchActivity searchActivity;

    public SearchActivityModule( SearchActivity searchActivity ) {
        this.searchActivity = searchActivity;
    }

    @ActivityScope
    @Provides
    SearchActivity providesSearchActivity() {
        return this.searchActivity;
    }

    @ActivityScope
    @Provides
    SearchViewModel providesSearchViewModel() {
        return new SearchViewModelImpl( this.searchActivity );
    }
}
