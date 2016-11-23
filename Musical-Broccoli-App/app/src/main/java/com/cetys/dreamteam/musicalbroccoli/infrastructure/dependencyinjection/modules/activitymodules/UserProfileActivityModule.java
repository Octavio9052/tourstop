package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules;

import android.databinding.DataBindingUtil;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.databinding.UserProfileActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.UserProfileViewModelImpl;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.UserProfileViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.UserProfileActivity;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Octavio on 2016/11/22.
 */
@Module
public class UserProfileActivityModule {
    private UserProfileActivity activity;

    public UserProfileActivityModule(UserProfileActivity activity) {
        this.activity = activity;
    }

    @ActivityScope
    @Provides
    UserProfileActivity providesUserProfileActivity(){
        return this.activity;
    }

    @ActivityScope
    @Provides
    UserProfileViewModel providesUserProfileViewModel(){
        return new UserProfileViewModelImpl(this.activity);
    }

    @ActivityScope
    @Provides
    UserProfileActivityBinding providesUserProfileActivityBinding(){
        return DataBindingUtil.setContentView(this.activity, R.layout.user_profile_activity);
    }
}
