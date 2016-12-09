package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.business.connectors.contracts.UserConnector;
import com.cetys.dreamteam.musicalbroccoli.core.models.User;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.LoginViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.CreateUserActivity;

/**
 * Created by Octavio on 2016/11/16.
 */
public class LoginViewModelImpl extends BaseViewModel implements LoginViewModel {

    //<editor-fold desc="Instance Properties" defaultstate="collapsed">
    private final UserConnector connector;
    private User user;
    //</editor-fold>

    public LoginViewModelImpl(Context context, UserConnector connector) {
        super(context);
        this.connector = connector;

        load();
    }

    @Override
    protected void load() {
        user = new User();
    }

    //<editor-fold desc="Property Accessors" defaultstate="collapsed">
    @Override
    public User getUser() {
        return user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
    }
    //</editor-fold>

    //<editor-fold desc="On-Click Listeners" defaultstate="collapsed">
    @Override
    public void onLoginClick(View view) {
        connector.login(user);
    }

    @Override
    public void onCreateUserClick(View view) {
        Intent intent = new Intent(context, CreateUserActivity.class);
        context.startActivity(intent);
    }
    //</editor-fold>

}
