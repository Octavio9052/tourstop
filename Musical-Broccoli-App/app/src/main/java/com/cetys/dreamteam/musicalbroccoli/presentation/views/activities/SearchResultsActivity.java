package com.cetys.dreamteam.musicalbroccoli.presentation.views.activities;

import android.os.Bundle;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.TourStopApplication;
import com.cetys.dreamteam.musicalbroccoli.databinding.SearchResultsActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.SearchResultsActivityModule;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.SearchResultsViewModel;

import javax.inject.Inject;

public class SearchResultsActivity extends BaseActivity {

    @Inject
    SearchResultsActivityBinding binding;
    @Inject
    SearchResultsViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_results_activity);

        initActivityComponent();
        initBinding();
    }

    @Override
    protected void initActivityComponent() {
        TourStopApplication.get(this).getUserSubcomponent()
                .plus(new SearchResultsActivityModule(this))
                .inject(this);
    }

    @Override
    protected void initBinding() {
        binding.setViewModel(viewModel);
    }
}
