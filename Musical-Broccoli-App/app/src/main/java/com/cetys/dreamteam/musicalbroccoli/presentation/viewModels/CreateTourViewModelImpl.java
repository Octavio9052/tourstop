package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.presentation.connectors.TourConnector;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.Tour;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.CreateTourViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.CheckpointActivity;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.CreatePromotionActivity;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.MainPageActivity;

/**
 * Created by Octavio on 2016/11/20.
 */

public class CreateTourViewModelImpl extends BaseViewModel implements CreateTourViewModel {

    //<editor-fold desc="Instance Properties" defaultstate="collapsed">
    private final TourConnector connector;
    private Tour tour;
    //</editor-fold>

    public CreateTourViewModelImpl(Context context, TourConnector connector) {
        super(context);
        this.connector = connector;
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
    //</editor-fold>

    //<editor-fold desc="On-Click Listeners" defaultstate="collapsed">
    @Override
    public void onSaveClick(View view) {
        connector.create(tour);
        // TODO: Currently redirects to MainPage, may change to the new Tour just created.
        Intent intent = new Intent(context, MainPageActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onPromotionClick(View view) {
        Intent intent = new Intent(context, CreatePromotionActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onCheckpointsClick(View view) {
        Intent intent = new Intent(context, CheckpointActivity.class);
        context.startActivity(intent);
    }
    //</editor-fold>

    @Override
    protected void load() {

    }
}
