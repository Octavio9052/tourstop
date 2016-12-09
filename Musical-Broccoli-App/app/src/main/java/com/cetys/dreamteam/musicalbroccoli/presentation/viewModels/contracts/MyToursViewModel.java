package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts;

import com.cetys.dreamteam.musicalbroccoli.core.models.Tour;

import java.util.List;

/**
 * Created by Octavio on 2016/11/20.
 */
public interface MyToursViewModel {
    List<Tour> getTours();

    void setTours(List<Tour> tours);
}
