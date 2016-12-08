package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts;

import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.core.models.User;

/**
 * Created by Octavio on 2016/11/20.
 */

public interface EditUserViewModel {

    User getUser();

    void setUser(User user);

    void onChangePasswordClick(View view);

    void onChangePaymentClick(View view);

    void onSaveChangesClick(View view);

}
