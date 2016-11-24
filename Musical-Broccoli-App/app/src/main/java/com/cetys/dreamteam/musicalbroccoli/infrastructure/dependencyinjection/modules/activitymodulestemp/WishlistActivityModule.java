package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp;

import android.databinding.DataBindingUtil;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.databinding.WishlistActivityBinding;
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

    @ActivityScope
    @Provides
    WishlistActivityBinding providesWishlistActivityBinding() {
        return DataBindingUtil.setContentView( this.wishlistActivity, R.layout.wishlist_activity );
    }
}
