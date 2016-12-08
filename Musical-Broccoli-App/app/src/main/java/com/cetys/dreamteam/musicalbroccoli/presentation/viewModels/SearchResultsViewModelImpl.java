package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.Tour;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.SearchResultsViewModel;

/**
 * Created by Octavio on 2016/12/04.
 */

public class SearchResultsViewModelImpl extends BaseViewModel implements SearchResultsViewModel {
    private Tour tour;

    public SearchResultsViewModelImpl(Context context) {
        super(context);
    }

    @Override
    protected void load() {

    }

    @Override
    public Tour getTour() {
        return tour;
    }

    @Override
    public void setTour(Tour tour) {
        this.tour = tour;
    }
}
