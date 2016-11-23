package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activityModules;

import android.databinding.DataBindingUtil;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.databinding.LoginActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.LoginViewModelImpl;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.LoginViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.LoginActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Octavio on 2016/11/21.
 */
@Module
public class LoginActivityModule {
    private LoginActivity activity;

    public LoginActivityModule(LoginActivity activity) {
        this.activity = activity;
    }

    @ActivityScope
    @Provides
    LoginActivity providesLoginActivity(){
        return this.activity;
    }

    @ActivityScope
    @Provides
    LoginViewModel providesLoginViewModel(){
        return new LoginViewModelImpl(this.activity);
    }

    @ActivityScope
    @Provides
    LoginActivityBinding providesLoginActivityBinding(){
        return DataBindingUtil.setContentView(this.activity, R.layout.login_activity);
    }
}
