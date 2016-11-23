package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents;

import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.MyToursActivity;

import dagger.Subcomponent;

/**
 * @Author J. Pichardo on 11/23/2016.
 */
@Subcomponent( modules = MyToursActivitySubcomponent.class )
public interface MyToursActivitySubcomponent {
    void inject( MyToursActivity myToursActivity );
}
