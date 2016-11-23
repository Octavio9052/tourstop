package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.TourModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.MyTourViewModel;

/**
 * Created by Octavio on 2016/11/20.
 */

public class MyTourViewModelImpl extends BaseViewModel implements MyTourViewModel {
    private TourModel tour;

    public MyTourViewModelImpl(Context context) {
        super(context);
    }

    @Override
    public TourModel getTour() {
        return this.tour;
    }

    @Override
    public void setTour(TourModel tour) {
        this.tour = tour;
    }
}
