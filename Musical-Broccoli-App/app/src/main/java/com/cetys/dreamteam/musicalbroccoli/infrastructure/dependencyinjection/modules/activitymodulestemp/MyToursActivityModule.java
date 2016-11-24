package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp;

import android.databinding.DataBindingUtil;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.databinding.MyToursActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.MyToursViewModelImpl;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.MyToursViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.MyToursActivity;

import dagger.Module;
import dagger.Provides;

/**
 * @Author J. Pichardo on 11/23/2016.
 */
@Module
public class MyToursActivityModule {

    private final MyToursActivity myToursActivity;

    public MyToursActivityModule( MyToursActivity myToursActivity ) {
        this.myToursActivity = myToursActivity;
    }

    @ActivityScope
    @Provides
    MyToursActivity providesMyToursActivity() {
        return this.myToursActivity;
    }

    @ActivityScope
    @Provides
    MyToursViewModel providesMyToursViewModel() {
        return new MyToursViewModelImpl( this.myToursActivity );
    }

    @ActivityScope
    @Provides
    MyToursActivityBinding providesMyToursActivityBinding() {
        return DataBindingUtil.setContentView( this.myToursActivity, R.layout.my_tours_activity );
    }
}
