package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.business.connectors.contracts.UserConnector;
import com.cetys.dreamteam.musicalbroccoli.core.models.User;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.ChangePasswordViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.UserProfileActivity;

/**
 * Created by Octavio on 2016/11/20.
 */
public class ChangePasswordViewModelImpl extends BaseViewModel implements ChangePasswordViewModel {

    //<editor-fold desc="Instance Properties" defaultstate="collapsed">
    private final UserConnector connector;
    private User user;
    //</editor-fold>

    public ChangePasswordViewModelImpl(Context context, UserConnector connector) {
        super(context);
        this.connector = connector;
    }

    //<editor-fold desc="Property Accessors" defaultstate="collapsed">
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    //</editor-fold>

    //<editor-fold desc="On-Click Listeners" defaultstate="collapsed">
    @Override
    public void onSaveChangesClick(View view) {
        connector.update(user);

        Intent intent = new Intent(context, UserProfileActivity.class);
        context.startActivity(intent);
    }
    //</editor-fold>

    @Override
    protected void load() {

    }
}
