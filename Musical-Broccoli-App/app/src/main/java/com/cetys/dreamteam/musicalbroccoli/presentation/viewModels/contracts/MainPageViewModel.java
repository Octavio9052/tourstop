package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts;

import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.UserModel;

/**
 * Created by Octavio on 2016/12/03.
 */

public interface MainPageViewModel {
    UserModel getUser();
    void setUser(UserModel user);

    void onUserProfileClick(View view);
    void onMyToursClick(View view);
    void onMessagesClick(View view);
    void onSearchClick(View view);
}
