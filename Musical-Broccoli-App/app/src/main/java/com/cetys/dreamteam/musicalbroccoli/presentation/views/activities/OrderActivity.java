package com.cetys.dreamteam.musicalbroccoli.presentation.views.activities;

import android.os.Bundle;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.TourStopApplication;
import com.cetys.dreamteam.musicalbroccoli.databinding.OrderActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.OrderActivityModule;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.OrderViewModel;

import javax.inject.Inject;

public class OrderActivity extends BaseActivity {

    @Inject
    OrderActivityBinding binding;
    @Inject
    OrderViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity);

        initActivityComponent();
        initBinding();
    }

    @Override
    protected void initActivityComponent() {
        TourStopApplication.get(this).getSessionSubcomponent()
                .plus(new OrderActivityModule(this))
                .inject(this);
    }

    @Override
    protected void initBinding() {
        binding.setViewModel(viewModel);
    }
}
