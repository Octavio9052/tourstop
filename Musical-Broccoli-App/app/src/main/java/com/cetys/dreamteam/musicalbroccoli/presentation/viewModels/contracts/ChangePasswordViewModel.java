package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts;

import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.UserModel;

/**
 * Created by Octavio on 2016/11/20.
 */

public interface ChangePasswordViewModel extends BaseModelViewModel<UserModel> {

    void onSaveChangesClick(View view);
}
