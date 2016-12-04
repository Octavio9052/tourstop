package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.UserModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.CreateUserViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.MainPageActivity;

/**
 * Created by Octavio on 2016/12/04.
 */

public class CreateUserViewModelImpl extends BaseViewModel implements CreateUserViewModel {
    private UserModel user;

    public CreateUserViewModelImpl(Context context) {
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

    @Override
    public void onSaveChangesClick(View view) {
        Intent intent = new Intent(context, MainPageActivity.class);
        context.startActivity(intent);
    }
}
