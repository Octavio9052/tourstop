package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules;

import android.databinding.DataBindingUtil;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.business.connectors.contracts.UserConnector;
import com.cetys.dreamteam.musicalbroccoli.databinding.LoginActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.LoginViewModelImpl;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.LoginViewModelImplValidator;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.LoginViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.LoginActivity;

import dagger.Module;
import dagger.Provides;

/**
 * @Author J. Pichardo on 11/21/2016.
 */
@Module
public class LoginActivityModule {

    private final LoginActivity activity;


    public LoginActivityModule(LoginActivity activity) {
        this.activity = activity;
    }

    @ActivityScope
    @Provides
    LoginActivity providesLoginActivity() {
        return this.activity;
    }

    @ActivityScope
    @Provides
    LoginViewModel providesLoginViewModel(UserConnector connector, LoginViewModelImplValidator validator) {
        return new LoginViewModelImpl(this.activity, connector, validator);
    }

    @ActivityScope
    @Provides
    LoginActivityBinding providesLoginActivityBinding() {
        return DataBindingUtil.setContentView(this.activity, R.layout.login_activity);
    }

    @ActivityScope
    @Provides
    LoginViewModelImplValidator providesLoginViewModelValidator() {
        return new LoginViewModelImplValidator(this.activity);
    }
}
