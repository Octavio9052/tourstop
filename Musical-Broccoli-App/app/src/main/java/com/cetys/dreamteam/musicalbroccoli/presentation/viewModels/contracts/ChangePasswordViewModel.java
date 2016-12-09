package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts;

import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.core.models.User;

/**
 * Created by Octavio on 2016/11/20.
 */

public interface ChangePasswordViewModel {
    void setConfirmPassword(String confirmPassword);
    String getConfirmPassword();

    void onSaveChangesClick(View view);

}
