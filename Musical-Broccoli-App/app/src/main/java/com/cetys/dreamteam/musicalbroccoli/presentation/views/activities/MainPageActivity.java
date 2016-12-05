package com.cetys.dreamteam.musicalbroccoli.presentation.views.activities;

import android.os.Bundle;
import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.TourStopApplication;
import com.cetys.dreamteam.musicalbroccoli.databinding.MainPageActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.MainPageActivityModule;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.MainPageViewModel;

import javax.inject.Inject;

public class MainPageActivity extends BaseActivity {

    @Inject
    MainPageActivityBinding binding;
    @Inject
    MainPageViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page_activity);

        initActivityComponent();
        initBinding();
    }

    //TODO: Bindings
    @Override
    protected void initActivityComponent() {
        TourStopApplication.get(this).getAppComponent().plus(new MainPageActivityModule(this)).inject(this);
    }

    @Override
    protected void initBinding() {
        binding.setViewModel(viewModel);
    }

}
