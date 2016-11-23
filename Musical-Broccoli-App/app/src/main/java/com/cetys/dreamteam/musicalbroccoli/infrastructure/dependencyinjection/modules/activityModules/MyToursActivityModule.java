package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activityModules;

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
}
