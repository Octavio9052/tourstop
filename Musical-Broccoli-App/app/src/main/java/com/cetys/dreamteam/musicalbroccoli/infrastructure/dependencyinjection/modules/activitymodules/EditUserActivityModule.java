package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules;

import android.databinding.DataBindingUtil;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.databinding.EditUserActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.EditUserViewModelImpl;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.EditUserViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.EditUserActivity;

import javax.inject.Inject;

import dagger.Provides;

/**
 * Created by Octavio on 2016/11/21.
 */

public class EditUserActivityModule {
    private EditUserActivity activity;

    public EditUserActivityModule(EditUserActivity activity) {
        this.activity = activity;
    }

    @Provides
    @Inject
    EditUserActivity providesEditUserActivity(){
        return this.activity;
    }

    @Provides
    @Inject
    EditUserViewModel providesEditUserViewModel(){
        return new EditUserViewModelImpl(this.activity);
    }

    EditUserActivityBinding providesEditUserActivityBinding(){
        return DataBindingUtil.setContentView(this.activity, R.layout.edit_user_activity);
    }
}
