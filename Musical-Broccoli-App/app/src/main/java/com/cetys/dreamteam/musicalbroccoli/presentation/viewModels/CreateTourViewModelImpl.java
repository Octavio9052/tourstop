package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.TourModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.CreateTourViewModel;

/**
 * Created by Octavio on 2016/11/20.
 */

public class CreateTourViewModelImpl extends BaseViewModel implements CreateTourViewModel {
    private TourModel tour;

    @Override
    public TourModel getTour() {
        return this.tour;
    }

    @Override
    public void setTour(TourModel tour) {
        this.tour = tour;
    }

    public CreateTourViewModelImpl(Context context) {
        super(context);
    }
}
