package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.UserModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.MainPageViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.CreateTourActivity;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.MessagesActivity;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.MyToursActivity;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.SearchActivity;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.UserProfileActivity;

/**
 * Created by Octavio on 2016/12/03.
 */

public class MainPageViewModelImpl extends BaseViewModel implements MainPageViewModel {
    private UserModel user;

    public MainPageViewModelImpl(Context context) {
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
    public void onUserProfileClick(View view) {
        Intent intent = new Intent(context, UserProfileActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onMyToursClick(View view) {
        Intent intent = new Intent(context, MyToursActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onMessagesClick(View view) {
        Intent intent = new Intent(context, MessagesActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onSearchClick(View view) {
        Intent intent = new Intent(context, SearchActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onFABClick(View view) {
        Intent intent = new Intent(context, CreateTourActivity.class);
        context.startActivity(intent);
    }
}
