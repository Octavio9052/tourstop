package com.cetys.dreamteam.musicalbroccoli.presentation.views.activities;

import android.os.Bundle;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.TourStopApplication;
import com.cetys.dreamteam.musicalbroccoli.databinding.TourProfileActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.TourProfileActivityModule;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.TourProfileViewModel;

import javax.inject.Inject;

public class TourProfileActivity extends BaseActivity {

    @Inject
    TourProfileActivityBinding binding;
    @Inject
    TourProfileViewModel viewModel;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.tour_profile_activity );

        initActivityComponent();
        initBinding();
    }

    @Override
    protected void initActivityComponent() {
        TourStopApplication.get( this ).getAppComponent()
                .plus( new TourProfileActivityModule( this ) ).inject( this );
    }

    @Override
    protected void initBinding() {
        binding.setViewModel( viewModel );
    }
}
