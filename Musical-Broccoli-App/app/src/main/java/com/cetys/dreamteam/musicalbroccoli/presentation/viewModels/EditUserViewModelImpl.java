package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.UserModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.EditUserViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.ChangePasswordActivity;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.PaymentOptionsActivity;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.UserProfileActivity;

/**
 * Created by Octavio on 2016/11/20.
 */

public class EditUserViewModelImpl extends BaseViewModel implements EditUserViewModel {
    private UserModel user;

    public EditUserViewModelImpl(Context context) {
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
    public void onChangePasswordClick(View view) {
        Intent intent = new Intent(context, ChangePasswordActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onChangePaymentClick(View view) {
        Intent intent = new Intent(context, PaymentOptionsActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onSaveChangesClick(View view) {
        doTemporalToast();
        Intent intent = new Intent(context, UserProfileActivity.class);
        context.startActivity(intent);
    }

    private void doTemporalToast() {
        Toast
                .makeText(context, "Your information has been modified successfully", Toast.LENGTH_LONG)
                .show();
    }
}
