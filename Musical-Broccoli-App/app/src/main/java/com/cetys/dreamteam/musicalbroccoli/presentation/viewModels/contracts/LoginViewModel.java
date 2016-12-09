package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts;

import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.core.models.User;

/**
 * Created by Octavio on 2016/11/16.
 */
public interface LoginViewModel {
    public User getUser();

    public void setUser(User user);

    public void onLoginClick(View view);

    public void onCreateUserClick(View view);

    String getEmailError();

    String getPasswordError();
}
