package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts;

import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.core.models.User;

/**
 * Created by Octavio on 2016/11/16.
 */
public interface LoginViewModel {
    User getUser();

    void setUser(User user);

    void onCreateUserClick(View view);
}
