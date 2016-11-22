package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.UserModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.EditUserViewModel;

/**
 * Created by Octavio on 2016/11/20.
 */

public class EditUserViewModelImpl extends BaseViewModel implements EditUserViewModel {

    private UserModel user;

    public EditUserViewModelImpl(Context context) {
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
