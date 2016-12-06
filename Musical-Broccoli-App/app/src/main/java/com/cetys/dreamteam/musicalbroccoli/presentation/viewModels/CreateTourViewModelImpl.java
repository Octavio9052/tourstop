package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.networking.services.TourService;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.TourModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.CreateTourViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.CheckpointActivity;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.CreatePromotionActivity;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.MainPageActivity;

/**
 * Created by Octavio on 2016/11/20.
 */

public class CreateTourViewModelImpl extends BaseModelViewModelImpl<TourModel> implements CreateTourViewModel {


    public CreateTourViewModelImpl(Context context, TourService service) {
        super(context, service);
    }

    //<editor-fold desc="On-Click Listeners" defaultstate="collapsed">
    @Override
    public void onSaveClick(View view) {
        create();
        // TODO: Currently redirects to MainPage, may change to the new Tour just created.
        Intent intent = new Intent(context, MainPageActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onPromotionClick(View view) {
        Intent intent = new Intent(context, CreatePromotionActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onCheckpointsClick(View view) {
        Intent intent = new Intent(context, CheckpointActivity.class);
        context.startActivity(intent);
    }
    //</editor-fold>

    private void doTemporalToast() {
        Toast.makeText(context, "Tour Saved", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void load() {

    }
}
