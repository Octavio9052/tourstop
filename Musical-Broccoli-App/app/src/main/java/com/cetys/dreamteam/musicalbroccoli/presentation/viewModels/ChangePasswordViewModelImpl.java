package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.UserModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.ChangePasswordViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.UserProfileActivity;

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

    @Override
    public void onSaveChangesClick(View view) {
        doTemporalToastThing();
        Intent intent = new Intent(context, UserProfileActivity.class);
        context.startActivity(intent);
    }

    private void doTemporalToastThing(){
        Toast.makeText(context, "Your password has been changed successfully", Toast.LENGTH_LONG).show();
    }
}
