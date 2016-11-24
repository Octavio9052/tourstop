package com.cetys.dreamteam.musicalbroccoli.presentation.views.activities;

import android.os.Bundle;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.TourStopApplication;
import com.cetys.dreamteam.musicalbroccoli.databinding.MyToursActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.MyToursActivityModule;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.MyToursViewModel;

import javax.inject.Inject;

public class MyToursActivity extends BaseActivity {

    @Inject
    MyToursActivityBinding binding;
    @Inject
    MyToursViewModel viewModel;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.my_tours_activity );

        initActivityComponent();
        initBinding();
    }

    @Override
    protected void initActivityComponent() {
        TourStopApplication.get( this ).getAppComponent()
                .plus( new MyToursActivityModule( this ) ).inject( this );
    }

    @Override
    protected void initBinding() {
        binding.setViewModel( viewModel );
    }
}
