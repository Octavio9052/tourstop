package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.TourModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.SearchViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.SearchResultsActivity;

/**
 * Created by Octavio on 2016/11/16.
 */

public class SearchViewModelImpl extends BaseViewModel implements SearchViewModel {
    private TourModel tour;

    public SearchViewModelImpl(Context context) {
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

    @Override
    public void onSearchClick(View view) {
        Intent intent = new Intent(context, SearchResultsActivity.class);
        context.startActivity(intent);
    }
}
