package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules;

import android.databinding.DataBindingUtil;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.business.connectors.contracts.UserConnector;
import com.cetys.dreamteam.musicalbroccoli.databinding.CreateUserActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.CreateUserViewModelImpl;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.CreateUserViewModelImplValidator;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.CreateUserViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.CreateUserActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Octavio on 2016/12/04.
 */
@Module
public class CreateUserActivityModule {
    private CreateUserActivity activity;

    public CreateUserActivityModule(CreateUserActivity activity) {
        this.activity = activity;
    }

    @ActivityScope
    @Provides
    CreateUserActivity providesCreateUserActivity() {
        return this.activity;
    }

    @ActivityScope
    @Provides
    CreateUserViewModel providesCreateUserViewModel(UserConnector connector, CreateUserViewModelImplValidator validator) {
        return new CreateUserViewModelImpl(this.activity, connector, validator);
    }

    @ActivityScope
    @Provides
    CreateUserActivityBinding providesCreateUserActivityBinding() {
        return DataBindingUtil.setContentView(this.activity, R.layout.create_user_activity);
    }

    @ActivityScope
    @Provides
    CreateUserViewModelImplValidator providesCreateUserViewModelValidator(){
        return new CreateUserViewModelImplValidator(this.activity);
    }
}