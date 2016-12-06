package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp;

import android.databinding.DataBindingUtil;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.databinding.CreatePromotionActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.CreatePromotionViewModelImpl;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.CreatePromotionViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.CreatePromotionActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Octavio on 2016/12/04.
 */
@Module
public class CreatePromotionActivityModule {
    private CreatePromotionActivity activity;

    public CreatePromotionActivityModule(CreatePromotionActivity activity) {
        this.activity = activity;
    }

    @ActivityScope
    @Provides
    CreatePromotionActivity providesCreatePromotionActivity() {
        return this.activity;
    }

    @ActivityScope
    @Provides
    CreatePromotionViewModel providesCreatePromotionViewModel() {
        return new CreatePromotionViewModelImpl(this.activity);
    }

    @ActivityScope
    @Provides
    CreatePromotionActivityBinding providesCreatePromotionActivityBinding() {
        return DataBindingUtil.setContentView(this.activity, R.layout.create_promotion_activity);
    }
}
