package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.TourModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.CreateTourViewModel;

/**
 * Created by Octavio on 2016/11/20.
 */

public class CreateTourViewModelImpl extends BaseViewModel implements CreateTourViewModel {
    private TourModel tour;

    public CreateTourViewModelImpl( Context context ) {
        super( context );
    }

    @Override
    public TourModel getTour() {
        return this.tour;
    }

    @Override
    public void setTour( TourModel tour ) {
        this.tour = tour;
    }

    @Override
    public void onSaveClick( View view ) {
        Toast toast = Toast.makeText( this.context, "Tour Saved", Toast.LENGTH_LONG );
        toast.show();
    }

}
