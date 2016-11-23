package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.PaymentOptionsActivityModule;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.PaymentOptionsActivity;

import dagger.Subcomponent;

/**
 * @Author J. Pichardo on 11/23/2016.
 */
@Subcomponent( modules = PaymentOptionsActivityModule.class )
public interface PaymentOptionsActivitySubcomponent {
    void inject( PaymentOptionsActivity paymentOptionsActivity );
}
