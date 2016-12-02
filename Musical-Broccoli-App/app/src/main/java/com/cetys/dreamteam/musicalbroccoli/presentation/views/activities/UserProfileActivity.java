package com.cetys.dreamteam.musicalbroccoli.presentation.views.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.TourStopApplication;
import com.cetys.dreamteam.musicalbroccoli.databinding.UserProfileActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.UserProfileActivityModule;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.UserProfileViewModel;

import javax.inject.Inject;

public class UserProfileActivity extends BaseActivity {

    @Inject
    UserProfileViewModel viewModel;
    @Inject
    UserProfileActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile_activity);
    }

    @Override
    protected void initActivityComponent() {
        TourStopApplication.get(this).getAppComponent().plus(new UserProfileActivityModule(this)).inject(this);

    }

    @Override
    protected void initBinding() {
        binding.setViewModel(viewModel);
    }

    public void goToEditUserActivity(View view) {
        Intent intent = new Intent(UserProfileActivity.this, EditUserActivity.class);
        UserProfileActivity.this.startActivity(intent);
    }

    public void goToMyToursActivity(View view) {
        Intent intent = new Intent(UserProfileActivity.this, MyToursActivity.class);
        UserProfileActivity.this.startActivity(intent);
    }

    public void goToWishlistActivity(View view){
        Intent intent = new Intent(UserProfileActivity.this, WishlistActivity.class);
        UserProfileActivity.this.startActivity(intent);
    }

    public void goToMessagesActivity(View view){
        Intent intent = new Intent(UserProfileActivity.this, MessagesActivity.class);
        UserProfileActivity.this.startActivity(intent);
    }

    public void goToCreateTour(View view) {
        Intent intent = new Intent(UserProfileActivity.this, CreateTourActivity.class);
        UserProfileActivity.this.startActivity(intent);
    }
}