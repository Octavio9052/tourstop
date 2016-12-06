package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts;

import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.UserModel;

/**
 * Created by Octavio on 2016/11/16.
 */

public interface UserProfileViewModel extends BaseModelViewModel<UserModel> {

    void onEditUserClick(View view);

    void onMyToursClick(View view);

    void onWishlistClick(View view);

    void onMessageClick(View view);

    void onCreateTourClick(View view);
}
