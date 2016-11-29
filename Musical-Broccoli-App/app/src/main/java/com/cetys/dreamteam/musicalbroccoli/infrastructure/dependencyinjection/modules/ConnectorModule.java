package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.networking.services.contracts.TourService;
import com.cetys.dreamteam.musicalbroccoli.presentation.connectors.TourConnectorImpl;
import com.cetys.dreamteam.musicalbroccoli.presentation.connectors.contracts.TourConnector;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.transformer.Transformer;

import dagger.Module;
import dagger.Provides;

/**
 * @Author J. Pichardo on 11/11/2016.
 */
@Module
public class ConnectorModule {

    @ActivityScope
    @Provides
    TourConnector providesTourConnector( Transformer transformer, TourService tourService ) {
        return new TourConnectorImpl( tourService, transformer );
    }

}
