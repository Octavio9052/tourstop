package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.UserScope;
import com.cetys.dreamteam.musicalbroccoli.networking.request.builders.ReadRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.networking.request.builders.ReadWriteRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.networking.services.OrderService;
import com.cetys.dreamteam.musicalbroccoli.networking.services.TourService;
import com.cetys.dreamteam.musicalbroccoli.networking.services.UserService;
import com.cetys.dreamteam.musicalbroccoli.presentation.connectors.OrderConnector;
import com.cetys.dreamteam.musicalbroccoli.presentation.connectors.TourConnector;
import com.cetys.dreamteam.musicalbroccoli.presentation.connectors.UserConnector;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.Order;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.Tour;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.User;

import dagger.Module;
import dagger.Provides;

/**
 * @Author J. Pichardo on 12/7/2016.
 */
@Module
public class ConnectorModule {

    @UserScope
    @Provides
    public UserConnector providesUserConnector(UserService service, ReadRequestBuilder readRequestBuilder, ReadWriteRequestBuilder<User> readWriteRequestBuilder) {
        return new UserConnector(readWriteRequestBuilder, readRequestBuilder, service);
    }

    @UserScope
    @Provides
    public TourConnector providesTourConnector(TourService service, ReadRequestBuilder readRequestBuilder, ReadWriteRequestBuilder<Tour> readWriteRequestBuilder) {
        return new com.cetys.dreamteam.musicalbroccoli.presentation.connectors.TourConnector(readWriteRequestBuilder, readRequestBuilder, service);
    }

    @UserScope
    @Provides
    public OrderConnector providesOrderConnector(OrderService service, ReadRequestBuilder readRequestBuilder, ReadWriteRequestBuilder<Order> readWriteRequestBuilder) {
        return new OrderConnector(readWriteRequestBuilder, readRequestBuilder, service);
    }

}
