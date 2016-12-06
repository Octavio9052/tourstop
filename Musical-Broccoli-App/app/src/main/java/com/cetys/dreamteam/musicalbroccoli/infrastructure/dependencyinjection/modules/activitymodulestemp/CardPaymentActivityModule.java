package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp;

import android.databinding.DataBindingUtil;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.databinding.CardPaymentActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.CardPaymentViewModelImpl;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.CardPaymentViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.CardPaymentActivity;

import dagger.Module;
import dagger.Provides;

/**
 * @Author J. Pichardo on 11/23/2016.
 */
@Module
public class CardPaymentActivityModule {

    private final CardPaymentActivity cardPaymentActivity;


    public CardPaymentActivityModule(CardPaymentActivity cardPaymentActivity) {
        this.cardPaymentActivity = cardPaymentActivity;
    }

    @ActivityScope
    @Provides
    CardPaymentActivity providesCardPaymentActivity() {
        return this.cardPaymentActivity;
    }

    @ActivityScope
    @Provides
    CardPaymentViewModel providesCardPaymentViewModel() {
        return new CardPaymentViewModelImpl(this.cardPaymentActivity);
    }

    @ActivityScope
    @Provides
    CardPaymentActivityBinding providesCardPaymentActivityBinding() {
        return DataBindingUtil
                .setContentView(this.cardPaymentActivity, R.layout.card_payment_activity);
    }
}
