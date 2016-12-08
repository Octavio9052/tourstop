package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.networking.services.UserService;
import com.cetys.dreamteam.musicalbroccoli.presentation.connectors.UserConnector;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.UserModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.UserProfileViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.CreateTourActivity;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.EditUserActivity;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.MessagesActivity;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.MyToursActivity;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.WishlistActivity;

/**
 * Created by Octavio on 2016/11/16.
 */

public class UserProfileViewModelImpl extends BaseModelViewModelImpl<UserModel> implements UserProfileViewModel {

    public UserProfileViewModelImpl(Context context, UserConnector baseService) {
        super(context, baseService);
    }

    @Override
    protected void load() {

    }

    //<editor-fold desc="On-Click Listeners" defaultstate="collapsed">
    @Override
    public void onEditUserClick(View view) {
        Intent intent = new Intent(context, EditUserActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onMyToursClick(View view) {
        Intent intent = new Intent(context, MyToursActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onWishlistClick(View view) {
        Intent intent = new Intent(context, WishlistActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onMessageClick(View view) {
        Intent intent = new Intent(context, MessagesActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onCreateTourClick(View view) {
        Intent intent = new Intent(context, CreateTourActivity.class);
        context.startActivity(intent);
    }
    //</editor-fold>

}
