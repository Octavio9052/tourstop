package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;

import com.cetys.dreamteam.musicalbroccoli.presentation.connectors.TourConnector;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.TourModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.TourProfileViewModel;

/**
 * @Author J. Pichardo on 11/23/2016.
 */

public class TourProfileViewModelImpl extends BaseModelViewModelImpl<TourModel> implements TourProfileViewModel {


    public TourProfileViewModelImpl(Context context, TourConnector connector) {
        super(context, connector);
    }

    @Override
    protected void load() {

    }

}
