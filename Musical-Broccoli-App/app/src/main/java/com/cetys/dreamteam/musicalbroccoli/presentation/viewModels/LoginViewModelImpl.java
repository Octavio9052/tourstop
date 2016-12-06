package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.UserModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.LoginViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.CreateUserActivity;

/**
 * Created by Octavio on 2016/11/16.
 */

public class LoginViewModelImpl extends BaseViewModel implements LoginViewModel {

    private UserModel user;

    public LoginViewModelImpl(Context context) {
        super(context);
    }

    @Override
    protected void load() {

    }

    @Override
    protected void initCallbacks() {

    }

    @Override
    public UserModel getUser() {
        return user;
    }

    @Override
    public void setUser(UserModel user) {
        this.user = user;
    }

    @Override
    public void onCreateUserClick(View view) {
        Intent intent = new Intent(context, CreateUserActivity.class);
        context.startActivity(intent);
    }
}
