package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.CheckpointViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.CreateTourActivity;

/**
 * @Author J. Pichardo on 11/23/2016.
 */

public class CheckpointViewModelImpl extends BaseViewModel implements CheckpointViewModel {
    public CheckpointViewModelImpl(Context context) {
        super(context);
    }

    @Override
    protected void load() {

    }

    @Override
    protected void initCallbacks() {

    }

    @Override
    public void onConfirmClick(View view) {
        doTemporalToastThing();
        Intent intent = new Intent(context, CreateTourActivity.class);
        context.startActivity(intent);
    }

    private void doTemporalToastThing() {
        Toast.makeText(context, "Your checkpoint has been saved", Toast.LENGTH_LONG).show();
    }
}
