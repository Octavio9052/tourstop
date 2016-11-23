package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.CardPaymentActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.ChangePasswordActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.CheckpointActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.CreateTourActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.EditUserActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.MessagesActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.MyToursActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.PaymentOptionsActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.SearchActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.TourProfileActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.UserProfileActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.WishlistActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.ServiceModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.UserModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.CardPaymentActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.ChangePasswordActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.CheckpointActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.CreateTourActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.EditUserActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.MessagesActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.MyToursActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.PaymentOptionsActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.SearchActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.TourProfileActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.UserProfileActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.WishlistActivityModule;

import dagger.Subcomponent;

/**
 * @Author J. Pichardo on 11/11/2016.
 */
@Subcomponent( modules = { UserModule.class, ServiceModule.class } )
public interface UserSubcomponent {
    //FIXME: LoginActivitySubcomponent plus(LoginActivityModule module); -- .getUserSubcomponent.plus -> Las Anotaciones del Mochis
    CardPaymentActivitySubcomponent plus( CardPaymentActivityModule module );

    ChangePasswordActivitySubcomponent plus( ChangePasswordActivityModule module );

    CheckpointActivitySubcomponent plus( CheckpointActivityModule module );

    CreateTourActivitySubcomponent plus( CreateTourActivityModule module );

    EditUserActivitySubcomponent plus( EditUserActivityModule module );

    MessagesActivitySubcomponent plus( MessagesActivityModule module );

    MyToursActivitySubcomponent plus( MyToursActivityModule module );

    PaymentOptionsActivitySubcomponent plus( PaymentOptionsActivityModule module );

    SearchActivitySubcomponent plus( SearchActivityModule module );

    TourProfileActivitySubcomponent plus( TourProfileActivityModule module );

    UserProfileActivitySubcomponent plus( UserProfileActivityModule module );

    WishlistActivitySubcomponent plus( WishlistActivityModule module );

}
