package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.CardPaymentActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.ChangePasswordActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.CheckpointActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.CreatePromotionActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.CreateTourActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.CreateUserActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.EditUserActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.LoginActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.MainPageActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.MessagesActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.MyToursActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.OrderActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.PaymentOptionsActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.SearchActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.SearchResultsActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.TourProfileActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.UserProfileActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.WishlistActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.ConnectorModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.ServiceModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.SessionModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.CardPaymentActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.ChangePasswordActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.CheckpointActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.CreatePromotionActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.CreateTourActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.CreateUserActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.EditUserActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.LoginActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.MainPageActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.MessagesActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.MyToursActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.OrderActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.PaymentOptionsActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.SearchActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.SearchResultsActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.TourProfileActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.UserProfileActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.WishlistActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.UserScope;

import dagger.Subcomponent;

/**
 * @Author J. Pichardo on 11/11/2016.
 */
@UserScope
@Subcomponent(modules = {SessionModule.class, ServiceModule.class, ConnectorModule.class})
public interface SessionSubcomponent {

    LoginActivitySubcomponent plus(LoginActivityModule module);

    CreateUserActivitySubcomponent plus(CreateUserActivityModule module);

    CardPaymentActivitySubcomponent plus(CardPaymentActivityModule module);

    ChangePasswordActivitySubcomponent plus(ChangePasswordActivityModule module);

    CheckpointActivitySubcomponent plus(CheckpointActivityModule module);

    CreatePromotionActivitySubcomponent plus(CreatePromotionActivityModule module);

    CreateTourActivitySubcomponent plus(CreateTourActivityModule module);

    EditUserActivitySubcomponent plus(EditUserActivityModule module);

    MainPageActivitySubcomponent plus(MainPageActivityModule module);

    MessagesActivitySubcomponent plus(MessagesActivityModule module);

    MyToursActivitySubcomponent plus(MyToursActivityModule module);

    OrderActivitySubcomponent plus(OrderActivityModule module);

    PaymentOptionsActivitySubcomponent plus(PaymentOptionsActivityModule module);

    SearchActivitySubcomponent plus(SearchActivityModule module);

    SearchResultsActivitySubcomponent plus(SearchResultsActivityModule module);

    TourProfileActivitySubcomponent plus(TourProfileActivityModule module);

    UserProfileActivitySubcomponent plus(UserProfileActivityModule module);

    WishlistActivitySubcomponent plus(WishlistActivityModule module);
}
