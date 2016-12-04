package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp;

import android.databinding.DataBindingUtil;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.databinding.SearchResultsActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.SearchResultsViewModelImpl;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.SearchResultsViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.SearchResultsActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Octavio on 2016/12/04.
 */
@Module
public class SearchResultsActivityModule {
    private SearchResultsActivity activity;

    public SearchResultsActivityModule(SearchResultsActivity activity) {
        this.activity =  activity;
    }

    @ActivityScope
    @Provides
    SearchResultsActivity providesSearchResultsActivity(){
        return this.activity;
    }

    @ActivityScope
    @Provides
    SearchResultsViewModel providesSearchResultsViewModel(){
        return new SearchResultsViewModelImpl(this.activity);
    }

    @ActivityScope
    @Provides
    SearchResultsActivityBinding providesSearchResultsActivityBinding(){
        return DataBindingUtil.setContentView(this.activity, R.layout.search_results_activity);
    }
}
