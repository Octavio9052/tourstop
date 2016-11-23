package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activityModules;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.WishlistViewModelImpl;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.WishlistViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.WishlistActivity;

import dagger.Module;
import dagger.Provides;

/**
 * @Author J. Pichardo on 11/23/2016.
 */
@Module
public class WishlistActivityModule {

    private final WishlistActivity wishlistActivity;

    public WishlistActivityModule( WishlistActivity wishlistActivity ) {
        this.wishlistActivity = wishlistActivity;
    }

    @ActivityScope
    @Provides
    WishlistActivity providesWishlistActivity() {
        return this.wishlistActivity;
    }

    @ActivityScope
    @Provides
    WishlistViewModel providesWishlistViewModel() {
        return new WishlistViewModelImpl( this.wishlistActivity );
    }
}
