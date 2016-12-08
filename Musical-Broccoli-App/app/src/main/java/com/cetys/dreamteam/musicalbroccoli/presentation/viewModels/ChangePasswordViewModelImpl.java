package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.presentation.connectors.UserConnector;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.User;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.ChangePasswordViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.UserProfileActivity;

/**
 * Created by Octavio on 2016/11/20.
 */
public class ChangePasswordViewModelImpl extends BaseModelViewModelImpl<User> implements ChangePasswordViewModel {

    public ChangePasswordViewModelImpl(Context context, UserConnector connector) {
        super(context, connector);
    }

    //<editor-fold desc="On-Click Listeners" defaultstate="collapsed">
    @Override
    public void onSaveChangesClick(View view) {
        connector.update(model);

        Intent intent = new Intent(context, UserProfileActivity.class);
        context.startActivity(intent);
    }
    //</editor-fold>

    private void doTemporalToastThing() {
        Toast.makeText(context, "Your password has been changed successfully", Toast.LENGTH_LONG)
                .show();
    }

    @Override
    protected void load() {

    }
}
