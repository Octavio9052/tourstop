package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts;

import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.TourModel;

/**
 * Created by Octavio on 2016/11/16.
 */

public interface SearchViewModel {
    TourModel getTour();
    void setTour(TourModel tour);

    void onSearchClick(View view);
}
