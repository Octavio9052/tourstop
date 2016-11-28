package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp;

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
 * @Author J. Pichardo on 11/21/2016.
 */
@Module
public class LoginActivityModule {

    private final LoginActivity loginActivity;

    public LoginActivityModule(
            LoginActivity loginActivity ) {
        this.loginActivity = loginActivity;
    }

    @ActivityScope
    @Provides
    LoginActivity providesLoginActivity() {
        return this.loginActivity;
    }

    @ActivityScope
    @Provides
    LoginViewModel providesLoginViewModel() {
        return new LoginViewModelImpl( this.loginActivity );
    }

    @ActivityScope
    @Provides
    LoginActivityBinding providesLoginActivityBinding() {
        return DataBindingUtil.setContentView( this.loginActivity, R.layout.login_activity );
    }
}
