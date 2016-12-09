package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.business.connectors.contracts.UserConnector;
import com.cetys.dreamteam.musicalbroccoli.core.models.User;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.EditUserViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.ChangePasswordActivity;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.PaymentOptionsActivity;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.UserProfileActivity;

/**
 * Created by Octavio on 2016/11/20.
 */
public class EditUserViewModelImpl extends BaseViewModel implements EditUserViewModel {

    //<editor-fold desc="Instance Properties" defaultstate="collapsed">
    private final UserConnector connector;
    private User user;
    //</editor-fold>

    public EditUserViewModelImpl(Context context, UserConnector connector) {
        super(context);
        this.connector = connector;
    }

    //<editor-fold desc="Property Accessors" defaultstate="collaped">
    @Override
    public User getUser() {
        return this.user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
    }
    //</editor-fold>

    //<editor-fold desc="On-Click Listeners" defaultstate="collapsed">
    @Override
    public void onChangePasswordClick(View view) {
        Intent intent = new Intent(context, ChangePasswordActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onChangePaymentClick(View view) {
        Intent intent = new Intent(context, PaymentOptionsActivity.class);
        context.startActivity(intent);
    }

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
