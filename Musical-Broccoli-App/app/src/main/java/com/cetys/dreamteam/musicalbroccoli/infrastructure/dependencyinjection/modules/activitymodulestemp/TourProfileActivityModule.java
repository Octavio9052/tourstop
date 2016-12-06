package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp;

import android.databinding.DataBindingUtil;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.databinding.TourProfileActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.networking.services.TourService;
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

    public TourProfileActivityModule(TourProfileActivity tourProfileActivity) {
        this.tourProfileActivity = tourProfileActivity;
    }

    @ActivityScope
    @Provides
    TourProfileActivity providesTourProfileActivity() {
        return this.tourProfileActivity;
    }

    @ActivityScope
    @Provides
    TourProfileViewModel providesTourProfileViewModel(TourService service) {
        return new TourProfileViewModelImpl(this.tourProfileActivity, service);
    }

    @ActivityScope
    @Provides
    TourProfileActivityBinding providesTourProfileActivityBinding() {
        return DataBindingUtil
                .setContentView(this.tourProfileActivity, R.layout.tour_profile_activity);
    }
}
