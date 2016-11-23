package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.TourProfileViewModelImpl;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.TourProfileViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.TourProfileActivity;

import dagger.Module;
import dagger.Provides;

/**
 * @Author J. Pichardo on 11/23/2016.
 */
@Module
public class TourProfileActivityModule {

    private final TourProfileActivity tourProfileActivity;

    public TourProfileActivityModule( TourProfileActivity tourProfileActivity ) {
        this.tourProfileActivity = tourProfileActivity;
    }

    @ActivityScope
    @Provides
    TourProfileActivity providesTourProfileActivity() {
        return this.tourProfileActivity;
    }

    @ActivityScope
    @Provides
    TourProfileViewModel providesTourProfileViewModel() {
        return new TourProfileViewModelImpl( this.tourProfileActivity );
    }
}
