package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.networking.services.UserService;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.UserModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.EditUserViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.ChangePasswordActivity;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.PaymentOptionsActivity;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.UserProfileActivity;

/**
 * Created by Octavio on 2016/11/20.
 */

public class EditUserViewModelImpl extends BaseModelViewModelImpl<UserModel> implements EditUserViewModel {

    public EditUserViewModelImpl(Context context, UserService service) {
        super(context, service);
    }

    //<editor-fold desc="On-Click Listeners" defaultstate="collapsed">
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
        update();
        Intent intent = new Intent(context, UserProfileActivity.class);
        context.startActivity(intent);
    }
    //</editor-fold>

    private void doTemporalToast() {
        Toast
                .makeText(context, "Your information has been modified successfully", Toast.LENGTH_LONG)
                .show();
    }

    @Override
    protected void load() {

    }
}
