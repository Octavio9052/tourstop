package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules;

import android.databinding.DataBindingUtil;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.databinding.ChangePasswordActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.ChangePasswordViewModelImpl;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.ChangePasswordViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.ChangePasswordActivity;

import javax.inject.Inject;

import dagger.Provides;

/**
 * Created by Octavio on 2016/11/22.
 */

public class ChangePasswordActivityModule {
    private ChangePasswordActivity activity;

    public ChangePasswordActivityModule(ChangePasswordActivity activity) {
        this.activity = activity;
    }

    @Provides
    @Inject
    ChangePasswordActivity providesChangePasswordActivity(){
        return this.activity;
    }

    @Provides
    @Inject
    ChangePasswordViewModel providesChangePasswordViewModel(){
        return new ChangePasswordViewModelImpl(this.activity);
    }

    @Provides
    @Inject
    ChangePasswordActivityBinding providesChangePasswordActivityBinding(){
        return DataBindingUtil.setContentView(this.activity, R.layout.change_password_activity);
    }
}
