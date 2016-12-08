package com.cetys.dreamteam.musicalbroccoli.presentation.views.activities;

import android.os.Bundle;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.TourStopApplication;
import com.cetys.dreamteam.musicalbroccoli.databinding.PaymentOptionsActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.PaymentOptionsActivityModule;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.PaymentOptionsViewModel;

import javax.inject.Inject;

public class PaymentOptionsActivity extends BaseActivity {

    @Inject
    PaymentOptionsActivityBinding binding;
    @Inject
    PaymentOptionsViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_options_activity);

        initActivityComponent();
        initBinding();
    }

    @Override
    protected void initActivityComponent() {
        TourStopApplication.get(this).getSessionSubcomponent()
                .plus(new PaymentOptionsActivityModule(this))
                .inject(this);
    }

    @Override
    protected void initBinding() {
        binding.setViewModel(viewModel);
    }

}
