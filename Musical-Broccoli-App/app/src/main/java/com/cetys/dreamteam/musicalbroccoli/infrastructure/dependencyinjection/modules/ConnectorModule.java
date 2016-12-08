package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.networking.request.builders.ReadRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.networking.request.builders.ReadWriteRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.networking.services.OrderService;
import com.cetys.dreamteam.musicalbroccoli.networking.services.TourService;
import com.cetys.dreamteam.musicalbroccoli.networking.services.UserService;
import com.cetys.dreamteam.musicalbroccoli.presentation.connectors.OrderConnector;
import com.cetys.dreamteam.musicalbroccoli.presentation.connectors.TourConnector;
import com.cetys.dreamteam.musicalbroccoli.presentation.connectors.UserConnector;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.OrderModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.SessionModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.TourModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.UserModel;

import dagger.Module;
import dagger.Provides;

/**
 * @Author J. Pichardo on 12/7/2016.
 */
@Module
public class ConnectorModule {

    @ActivityScope
    @Provides
    public UserConnector providesUserConnector(UserService service, ReadRequestBuilder readRequestBuilder, ReadWriteRequestBuilder<UserModel> readWriteRequestBuilder) {
        return new UserConnector(readWriteRequestBuilder, readRequestBuilder, service);
    }

    @ActivityScope
    @Provides
    public TourConnector providesTourConnector(TourService service, ReadRequestBuilder readRequestBuilder, ReadWriteRequestBuilder<TourModel> readWriteRequestBuilder) {
        return new com.cetys.dreamteam.musicalbroccoli.presentation.connectors.TourConnector(readWriteRequestBuilder, readRequestBuilder, service);
    }

    @ActivityScope
    @Provides
    public OrderConnector providesOrderConnector(OrderService service, ReadRequestBuilder readRequestBuilder, ReadWriteRequestBuilder<OrderModel> readWriteRequestBuilder) {
        return new OrderConnector(readWriteRequestBuilder, readRequestBuilder, service);
    }

    @ActivityScope
    @Provides
    public ReadRequestBuilder providesReadRequestBuilder(SessionModel session) {
        return new ReadRequestBuilder(session);
    }

    @ActivityScope
    @Provides
    public ReadWriteRequestBuilder<UserModel> providesUserReadWriteRequestBuilder(SessionModel session) {
        return new ReadWriteRequestBuilder<>(session);
    }

    @ActivityScope
    @Provides
    public ReadWriteRequestBuilder<TourModel> providesTourReadWriteRequestBuilder(SessionModel session) {
        return new ReadWriteRequestBuilder<>(session);
    }

    @ActivityScope
    @Provides
    public ReadWriteRequestBuilder<OrderModel> providesOrderReadWriteRequestBuilder(SessionModel session) {
        return new ReadWriteRequestBuilder<>(session);
    }

}
