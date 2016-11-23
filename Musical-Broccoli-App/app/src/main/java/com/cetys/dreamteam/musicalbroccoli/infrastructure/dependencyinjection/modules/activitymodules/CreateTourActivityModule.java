package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activityModules;

import android.databinding.DataBindingUtil;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.databinding.CreateTourActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.CreateTourViewModelImpl;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.CreateTourViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.CreateTourActivity;



import dagger.Module;
import dagger.Provides;

/**
 * Created by Octavio on 2016/11/23.
 */
@Module
public class CreateTourActivityModule {
    private CreateTourActivity activity;

    public CreateTourActivityModule(CreateTourActivity activity) {
        this.activity = activity;
    }

    @ActivityScope
    @Provides
    CreateTourActivity providesCreateTourActivity(){
        return this.activity;
    }

    @ActivityScope
    @Provides
    CreateTourViewModel providesCreateTourViewModel(){
        return new CreateTourViewModelImpl(this.activity);
    }

    @ActivityScope
    @Provides
    CreateTourActivityBinding providesCreateTourActivityBinding(){
        return DataBindingUtil.setContentView(this.activity, R.layout.create_tour_activity);
    }
}
