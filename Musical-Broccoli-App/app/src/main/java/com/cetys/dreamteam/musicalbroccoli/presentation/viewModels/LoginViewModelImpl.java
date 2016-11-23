package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.UserModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.LoginViewModel;

/**
 * Created by Octavio on 2016/11/16.
 */

public class LoginViewModelImpl extends BaseViewModel implements LoginViewModel {

    private UserModel user;

    public LoginViewModelImpl(Context context) {
        super(context);
    }

    @Override
    public UserModel getUser() {
        return user;
    }

    @Override
    public void setUser(UserModel user) {
        this.user = user;
    }
}
