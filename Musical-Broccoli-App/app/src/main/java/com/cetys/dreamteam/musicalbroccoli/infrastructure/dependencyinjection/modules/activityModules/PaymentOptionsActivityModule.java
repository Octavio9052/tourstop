package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activityModules;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.PaymentOptionsViewModelImpl;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.PaymentOptionsViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.PaymentOptionsActivity;

import dagger.Module;
import dagger.Provides;

/**
 * @Author J. Pichardo on 11/23/2016.
 */
@Module
public class PaymentOptionsActivityModule {

    private final PaymentOptionsActivity paymentOptionsActivity;

    public PaymentOptionsActivityModule( PaymentOptionsActivity paymentOptionsActivity ) {
        this.paymentOptionsActivity = paymentOptionsActivity;
    }

    @ActivityScope
    @Provides
    PaymentOptionsActivity providesPaymentOptionsActivity() {
        return this.paymentOptionsActivity;
    }

    @ActivityScope
    @Provides
    PaymentOptionsViewModel providesPaymentOptionsViewModel() {
        return new PaymentOptionsViewModelImpl( this.paymentOptionsActivity );
    }
}
