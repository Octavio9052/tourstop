package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts;

import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.User;

/**
 * Created by Octavio on 2016/12/03.
 */

public interface MainPageViewModel {
    User getUser();

    void setUser(User user);

    void onUserProfileClick(View view);

    void onMyToursClick(View view);

    void onMessagesClick(View view);

    void onSearchClick(View view);

    void onFABClick(View view);
}
