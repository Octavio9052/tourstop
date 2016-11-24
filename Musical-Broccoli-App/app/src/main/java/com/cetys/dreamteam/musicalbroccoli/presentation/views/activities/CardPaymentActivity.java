package com.cetys.dreamteam.musicalbroccoli.presentation.views.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.TourStopApplication;
import com.cetys.dreamteam.musicalbroccoli.databinding.CardPaymentActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.CardPaymentActivityModule;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.CardPaymentViewModel;

import javax.inject.Inject;

public class CardPaymentActivity extends BaseActivity {

    @Inject
    CardPaymentActivityBinding binding;
    @Inject
    CardPaymentViewModel viewModel;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.card_payment_activity );

        initActivityComponent();
        initBinding();
    }

    @Override
    protected void initActivityComponent() {
        TourStopApplication.get(this).getAppComponent().plus(new CardPaymentActivityModule(this)).inject(this);
    }

    @Override
    protected void initBinding() {
        binding.setViewModel( viewModel );
    }

    public void doToast( View view ) {
        Toast.makeText( CardPaymentActivity.this, "You have added a new card successfully",
                Toast.LENGTH_LONG ).show();
        Intent intent = new Intent( CardPaymentActivity.this, UserProfileActivity.class );
        CardPaymentActivity.this.startActivity( intent );
    }
}
