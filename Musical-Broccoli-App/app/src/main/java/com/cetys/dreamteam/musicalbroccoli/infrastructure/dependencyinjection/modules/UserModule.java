package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.UserScope;
import com.cetys.dreamteam.musicalbroccoli.networking.request.builders.ReadRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.networking.request.builders.ReadWriteRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.Order;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.Session;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.Tour;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.User;

import dagger.Module;
import dagger.Provides;

/**
 * @Author J. Pichardo on 11/11/2016.
 */
@Module
public class UserModule {

    private final Session session;

    public UserModule(Session session) {
        this.session = session;
    }

    @UserScope
    @Provides
    public Session providesSession() {
        return this.session;
    }

    @UserScope
    @Provides
    public ReadRequestBuilder providesReadRequestBuilder() {
        return new ReadRequestBuilder(session);
    }

    @UserScope
    @Provides
    public ReadWriteRequestBuilder<User> providesUserReadWriteRequestBuilder() {
        return new ReadWriteRequestBuilder<>(session);
    }

    @UserScope
    @Provides
    public ReadWriteRequestBuilder<Tour> providesTourReadWriteRequestBuilder() {
        return new ReadWriteRequestBuilder<>(session);
    }

    @UserScope
    @Provides
    public ReadWriteRequestBuilder<Order> providesOrderReadWriteRequestBuilder() {
        return new ReadWriteRequestBuilder<>(session);
    }


}
