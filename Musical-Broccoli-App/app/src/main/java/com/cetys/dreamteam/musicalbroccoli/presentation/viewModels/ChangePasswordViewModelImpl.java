package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.UserModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.ChangePasswordViewModel;

/**
 * Created by Octavio on 2016/11/20.
 */

public class ChangePasswordViewModelImpl extends BaseViewModel implements ChangePasswordViewModel {
    private UserModel user;

    public ChangePasswordViewModelImpl(Context context) {
        super(context);
    }

    @Override
    public UserModel getUser() {
        return this.user;
    }

    @Override
    public void setUser(UserModel user) {
        this.user = user;
    }
}
