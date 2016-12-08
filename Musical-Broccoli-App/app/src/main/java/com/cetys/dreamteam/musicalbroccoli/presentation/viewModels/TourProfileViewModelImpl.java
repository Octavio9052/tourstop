package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;

import com.cetys.dreamteam.musicalbroccoli.business.connectors.contracts.TourConnector;
import com.cetys.dreamteam.musicalbroccoli.core.models.Tour;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.TourProfileViewModel;

/**
 * @Author J. Pichardo on 11/23/2016.
 */
public class TourProfileViewModelImpl extends BaseViewModel implements TourProfileViewModel {

    //<editor-fold desc="Instance Properties" defaultstate="collapsed">
    private final TourConnector connector;
    private Tour tour;
    //</editor-fold>

    public TourProfileViewModelImpl(Context context, TourConnector connector) {
        super(context);
        this.connector = connector;
    }

    @Override
    protected void load() {

    }

    //<editor-fold desc="Property Accessors" defaultstate="collapsed">
    @Override
    public Tour getTour() {
        return this.tour;
    }

    @Override
    public void setTour(Tour tour) {
        this.tour = tour;
    }
    //</editor-fold>s
}
