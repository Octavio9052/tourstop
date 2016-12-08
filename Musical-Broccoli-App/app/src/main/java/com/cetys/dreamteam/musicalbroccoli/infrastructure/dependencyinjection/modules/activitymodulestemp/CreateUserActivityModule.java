package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp;

import android.databinding.DataBindingUtil;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.databinding.CreateUserActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.UserScope;
import com.cetys.dreamteam.musicalbroccoli.networking.request.builders.ReadRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.networking.request.builders.ReadWriteRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.networking.services.OrderService;
import com.cetys.dreamteam.musicalbroccoli.networking.services.TourService;
import com.cetys.dreamteam.musicalbroccoli.networking.services.UserService;
import com.cetys.dreamteam.musicalbroccoli.presentation.connectors.OrderConnector;
import com.cetys.dreamteam.musicalbroccoli.presentation.connectors.TourConnector;
import com.cetys.dreamteam.musicalbroccoli.presentation.connectors.UserConnector;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.OrderModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.TourModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.UserModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.CreateUserViewModelImpl;
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
    CreateUserViewModel providesCreateUserViewModel(UserConnector connector) {
        return new CreateUserViewModelImpl(this.activity, connector);
    }

    @ActivityScope
    @Provides
    CreateUserActivityBinding providesCreateUserActivityBinding() {
        return DataBindingUtil.setContentView(this.activity, R.layout.create_user_activity);
    }



}