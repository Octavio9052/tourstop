package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp;

import android.databinding.DataBindingUtil;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.databinding.MainPageActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.MainPageViewModelImpl;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.MainPageViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.MainPageActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Octavio on 2016/12/03.
 */

@Module
public class MainPageActivityModule {
    private MainPageActivity activity;

    public MainPageActivityModule(MainPageActivity activity) {
        this.activity = activity;
    }

    @ActivityScope
    @Provides
    MainPageActivity providesMainPageActivity() {
        return this.activity;
    }

    @ActivityScope
    @Provides
    MainPageViewModel providesMainPageViewModel() {
        return new MainPageViewModelImpl(this.activity);
    }

    @ActivityScope
    @Provides
    MainPageActivityBinding providesMainPageActivityBinding() {
        return DataBindingUtil.setContentView(this.activity, R.layout.main_page_activity);
    }

}
