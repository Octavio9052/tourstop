package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules;

import android.databinding.DataBindingUtil;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.business.connectors.contracts.UserConnector;
import com.cetys.dreamteam.musicalbroccoli.databinding.ChangePasswordActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.ChangePasswordViewModelImpl;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.ChangePasswordViewModelImplValidator;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.ChangePasswordViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.ChangePasswordActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Octavio on 2016/11/22.
 */
@Module
public class ChangePasswordActivityModule {
    private ChangePasswordActivity activity;

    public ChangePasswordActivityModule(ChangePasswordActivity activity) {
        this.activity = activity;
    }

    @ActivityScope
    @Provides
    ChangePasswordActivity providesChangePasswordActivity() {
        return this.activity;
    }

    @ActivityScope
    @Provides
    ChangePasswordViewModel providesChangePasswordViewModel(UserConnector connector, ChangePasswordViewModelImplValidator validator) {
        return new ChangePasswordViewModelImpl(this.activity, connector, validator);
    }

    @ActivityScope
    @Provides
    ChangePasswordActivityBinding providesChangePasswordActivityBinding() {
        return DataBindingUtil.setContentView(this.activity, R.layout.change_password_activity);
    }

    @ActivityScope
    @Provides
    ChangePasswordViewModelImplValidator providesChangePasswordViewModelValidator(){
        return new ChangePasswordViewModelImplValidator(this.activity);
    }
}
