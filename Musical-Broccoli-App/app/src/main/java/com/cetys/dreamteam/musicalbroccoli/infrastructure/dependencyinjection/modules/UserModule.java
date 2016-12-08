package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.UserScope;
import com.cetys.dreamteam.musicalbroccoli.networking.request.builders.ReadRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.networking.request.builders.ReadWriteRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.OrderModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.SessionModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.TourModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.UserModel;

import dagger.Module;
import dagger.Provides;

/**
 * @Author J. Pichardo on 11/11/2016.
 */
@Module
public class UserModule {

    private SessionModel session;

    public UserModule(SessionModel session) {
        this.session = session;
    }

    @UserScope
    @Provides
    public SessionModel providesSession() {
        return this.session;
    }

//    @UserScope
//    @Provides
//    public ReadRequestBuilder providesReadRequestBuilder() {
//        return new ReadRequestBuilder(session);
//    }
//
//    @UserScope
//    @Provides
//    public ReadWriteRequestBuilder<UserModel> providesUserReadWriteRequestBuilder() {
//        return new ReadWriteRequestBuilder<>(session);
//    }
//
//    @UserScope
//    @Provides
//    public ReadWriteRequestBuilder<TourModel> providesTourReadWriteRequestBuilder() {
//        return new ReadWriteRequestBuilder<>(session);
//    }
//
//    @UserScope
//    @Provides
//    public ReadWriteRequestBuilder<OrderModel> providesOrderReadWriteRequestBuilder() {
//        return new ReadWriteRequestBuilder<>(session);
//    }


}
