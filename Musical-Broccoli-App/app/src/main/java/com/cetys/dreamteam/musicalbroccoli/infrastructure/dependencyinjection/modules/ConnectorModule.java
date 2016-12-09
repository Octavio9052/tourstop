package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules;

import android.app.Application;

import com.cetys.dreamteam.musicalbroccoli.business.connectors.OrderConnectorImpl;
import com.cetys.dreamteam.musicalbroccoli.business.connectors.TourConnectorImpl;
import com.cetys.dreamteam.musicalbroccoli.business.connectors.UserConnectorImpl;
import com.cetys.dreamteam.musicalbroccoli.business.connectors.contracts.OrderConnector;
import com.cetys.dreamteam.musicalbroccoli.business.connectors.contracts.TourConnector;
import com.cetys.dreamteam.musicalbroccoli.business.connectors.contracts.UserConnector;
import com.cetys.dreamteam.musicalbroccoli.core.models.Order;
import com.cetys.dreamteam.musicalbroccoli.core.models.Tour;
import com.cetys.dreamteam.musicalbroccoli.core.models.User;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.UserScope;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.builders.ReadRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.builders.ReadWriteRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.services.OrderService;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.services.TourService;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.services.UserService;

import dagger.Module;
import dagger.Provides;

/**
 * @Author J. Pichardo on 12/7/2016.
 */
@Module
public class ConnectorModule {

    @UserScope
    @Provides
    public UserConnector providesUserConnector(Application application, UserService service,
                                               ReadRequestBuilder readRequestBuilder,
                                               ReadWriteRequestBuilder<User> readWriteRequestBuilder) {
        return new UserConnectorImpl(application, readWriteRequestBuilder, readRequestBuilder,
                service);
    }

    @UserScope
    @Provides
    public TourConnector providesTourConnector(Application application, TourService service,
                                               ReadRequestBuilder readRequestBuilder,
                                               ReadWriteRequestBuilder<Tour> readWriteRequestBuilder) {
        return new TourConnectorImpl(application, readWriteRequestBuilder, readRequestBuilder,
                service);
    }

    @UserScope
    @Provides
    public OrderConnector providesOrderConnector(Application application, OrderService service,
                                                 ReadRequestBuilder readRequestBuilder,
                                                 ReadWriteRequestBuilder<Order> readWriteRequestBuilder) {
        return new OrderConnectorImpl(application, readWriteRequestBuilder, readRequestBuilder,
                service);
    }

}
