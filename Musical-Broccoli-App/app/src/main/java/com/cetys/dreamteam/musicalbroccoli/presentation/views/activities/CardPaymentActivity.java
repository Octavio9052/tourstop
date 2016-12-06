package com.cetys.dreamteam.musicalbroccoli.presentation.views.activities;

import android.os.Bundle;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.TourStopApplication;
import com.cetys.dreamteam.musicalbroccoli.databinding.CardPaymentActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.CardPaymentActivityModule;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.CardPaymentViewModel;

import javax.inject.Inject;

public class CardPaymentActivity extends BaseActivity {

    @Inject
    CardPaymentActivityBinding binding;
    @Inject
    CardPaymentViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_payment_activity);

        initActivityComponent();
        initBinding();
    }

    @Override
    protected void initActivityComponent() {
        TourStopApplication.get(this).getUserSubcomponent()
                .plus(new CardPaymentActivityModule(this))
                .inject(this);
    }

    @Override
    protected void initBinding() {
        binding.setViewModel(viewModel);
    }

}
