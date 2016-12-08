package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts;

import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.Tour;

/**
 * Created by Octavio on 2016/11/16.
 */

public interface SearchViewModel {
    Tour getTour();

    void setTour(Tour tour);

    void onSearchClick(View view);
}
