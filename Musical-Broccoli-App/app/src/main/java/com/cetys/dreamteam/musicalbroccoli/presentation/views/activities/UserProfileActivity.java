package com.cetys.dreamteam.musicalbroccoli.presentation.views.activities;

import android.os.Bundle;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.TourStopApplication;
import com.cetys.dreamteam.musicalbroccoli.databinding.UserProfileActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.UserProfileActivityModule;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.UserProfileViewModel;

import javax.inject.Inject;

public class UserProfileActivity extends BaseActivity {

    @Inject
    UserProfileActivityBinding binding;
    @Inject
    UserProfileViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile_activity);

        initActivityComponent();
        initBinding();
    }

    @Override
    protected void initActivityComponent() {
        TourStopApplication.get(this).getAppComponent().plus(new UserProfileActivityModule(this)).inject(this);
    }

    @Override
    protected void initBinding() {
        binding.setViewModel(viewModel);
    }
}