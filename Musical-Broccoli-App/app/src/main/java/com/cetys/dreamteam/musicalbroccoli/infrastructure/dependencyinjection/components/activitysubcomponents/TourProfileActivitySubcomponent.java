package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.TourProfileActivityModule;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.TourProfileActivity;

import dagger.Subcomponent;

/**
 * @Author J. Pichardo on 11/23/2016.
 */
@Subcomponent( modules = TourProfileActivityModule.class )
public interface TourProfileActivitySubcomponent {
    void inject( TourProfileActivity tourProfileActivity );
}
