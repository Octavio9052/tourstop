package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts;

import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.core.models.Tour;

/**
 * Created by Octavio on 2016/11/20.
 */

public interface CreateTourViewModel {

    Tour getTour();

    void setTour(Tour tour);

    void onSaveClick(View view);

    void onPromotionClick(View view);

    void onCheckpointsClick(View view);
}
