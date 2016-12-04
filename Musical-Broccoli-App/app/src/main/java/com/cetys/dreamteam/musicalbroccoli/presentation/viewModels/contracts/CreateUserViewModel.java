package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts;

import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.UserModel;

/**
 * Created by Octavio on 2016/12/04.
 */

public interface CreateUserViewModel {
    UserModel getUser();
    void setUser(UserModel user);

    void onSaveChangesClick(View view);
}
