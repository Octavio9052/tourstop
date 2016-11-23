package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents;

import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.WishlistActivity;

import dagger.Subcomponent;

/**
 * @Author J. Pichardo on 11/23/2016.
 */
@Subcomponent( modules = WishlistActivitySubcomponent.class )
public interface WishlistActivitySubcomponent {
    void inject( WishlistActivity wishlistActivity );
}
