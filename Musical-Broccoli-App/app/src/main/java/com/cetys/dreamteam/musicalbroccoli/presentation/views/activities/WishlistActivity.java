package com.cetys.dreamteam.musicalbroccoli.presentation.views.activities;

import android.os.Bundle;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.TourStopApplication;
import com.cetys.dreamteam.musicalbroccoli.databinding.WishlistActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.WishlistActivityModule;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.WishlistViewModel;

import javax.inject.Inject;

public class WishlistActivity extends BaseActivity {

    @Inject
    WishlistActivityBinding binding;
    @Inject
    WishlistViewModel viewModel;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.wishlist_activity );

        initActivityComponent();
        initBinding();
    }

    @Override
    protected void initActivityComponent() {
        TourStopApplication.get( this ).getAppComponent()
                .plus( new WishlistActivityModule( this ) ).inject( this );
    }

    @Override
    protected void initBinding() {
        binding.setViewModel( viewModel );
    }
}
