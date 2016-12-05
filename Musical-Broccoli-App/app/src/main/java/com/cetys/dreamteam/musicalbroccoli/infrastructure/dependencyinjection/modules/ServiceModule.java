package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.UserScope;

import dagger.Module;
import dagger.Provides;

/**
 * @Author J. Pichardo on 11/11/2016.
 */
@Module
public class ServiceModule {

    @UserScope
    @Provides
    TourService providesTourService() {
        return new TourServiceImpl();
    }
}
