package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp;

import android.databinding.DataBindingUtil;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.databinding.OrderActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.OrderViewModelImpl;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.OrderViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.OrderActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Octavio on 2016/12/03.
 */

@Module
public class OrderActivityModule {
    private OrderActivity activity;

    public OrderActivityModule(OrderActivity activity) {
        this.activity = activity;
    }

    @ActivityScope
    @Provides
    OrderActivity providesOrderActivity() {
        return this.activity;
    }

    @ActivityScope
    @Provides
    OrderViewModel providesOrderViewModel() {
        return new OrderViewModelImpl(this.activity);
    }

    @ActivityScope
    @Provides
    OrderActivityBinding providesOrderActivityBinding() {
        return DataBindingUtil.setContentView(this.activity, R.layout.order_activity);
    }
}
