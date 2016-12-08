package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;

import com.cetys.dreamteam.musicalbroccoli.core.models.Tour;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.MyToursViewModel;

import java.util.List;

/**
 * Created by Octavio on 2016/11/20.
 */

public class MyToursViewModelImpl extends BaseViewModel implements MyToursViewModel {
    private List<Tour> tours;

    public MyToursViewModelImpl(Context context) {
        super(context);
    }

    @Override
    protected void load() {

    }

    @Override
    public List<Tour> getTours() {
        return this.tours;
    }

    @Override
    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }
}
