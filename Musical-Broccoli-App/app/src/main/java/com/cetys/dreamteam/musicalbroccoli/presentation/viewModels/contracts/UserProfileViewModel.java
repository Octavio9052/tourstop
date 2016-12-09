package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts;

import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.core.models.User;

/**
 * Created by Octavio on 2016/11/16.
 */

public interface UserProfileViewModel {

    User getUser();

    void setUser(User user);

    void onEditUserClick(View view);

    void onMyToursClick(View view);

    void onWishlistClick(View view);

    void onMessageClick(View view);

    void onCreateTourClick(View view);
}
