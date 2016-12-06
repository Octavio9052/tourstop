package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.TourModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.MyToursViewModel;

/**
 * Created by Octavio on 2016/11/20.
 */

public class MyToursViewModelImpl extends BaseViewModel implements MyToursViewModel {
    private TourModel tour;

    public MyToursViewModelImpl(Context context) {
        super(context);
    }

    @Override
    protected void load() {

    }

    @Override
    protected void initCallbacks() {

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
