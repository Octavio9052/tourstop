package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.UserScope;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.services.MessageService;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.services.OrderService;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.services.TourService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * @Author J. Pichardo on 11/11/2016.
 */
@Module
public class ServiceModule {

    @UserScope
    @Provides
    TourService providesTourService(Retrofit retrofit) {
        return retrofit.create(TourService.class);
    }

    @UserScope
    @Provides
    MessageService providesMessageService(Retrofit retrofit) {
        return retrofit.create(MessageService.class);
    }

    @UserScope
    @Provides
    OrderService providesOrderService(Retrofit retrofit) {
        return retrofit.create(OrderService.class);
    }
}
