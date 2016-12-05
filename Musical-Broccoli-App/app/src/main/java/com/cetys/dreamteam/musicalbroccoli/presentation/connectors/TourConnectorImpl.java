package com.cetys.dreamteam.musicalbroccoli.presentation.connectors;

import com.cetys.dreamteam.musicalbroccoli.commons.dtos.TourDto;
import com.cetys.dreamteam.musicalbroccoli.presentation.connectors.contracts.TourConnector;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.TourModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.transformer.Transformer;

/**
 * @Author J. Pichardo on 11/28/2016.
 */

public class TourConnectorImpl extends BaseConnectorImpl< TourModel, TourDto, TourService >
        implements TourConnector {

    public TourConnectorImpl(
            BaseService< TourDto > service,
            Transformer transformer ) {
        super( service, transformer );
    }

}
