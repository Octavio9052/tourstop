package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts;

import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.TourModel;

/**
 * Created by Octavio on 2016/11/20.
 */

public interface CreateTourViewModel {
    TourModel getTour();

    void setTour( TourModel tour );

    void onSaveClick( View view );
}
