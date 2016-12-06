package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.TourModel;

/**
 * Created by Octavio on 2016/12/04.
 */

public interface SearchResultsViewModel {
    TourModel getTour();

    void setTour(TourModel tour);
}
