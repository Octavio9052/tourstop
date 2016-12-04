package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.TourModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.SearchResultsViewModel;

/**
 * Created by Octavio on 2016/12/04.
 */

public class SearchResultsViewModelImpl extends BaseViewModel implements SearchResultsViewModel {
    private TourModel tour;

    public SearchResultsViewModelImpl(Context context) {
        super(context);
    }

    @Override
    public TourModel getTour() {
        return tour;
    }

    @Override
    public void setTour(TourModel tour) {
        this.tour = tour;
    }
}
