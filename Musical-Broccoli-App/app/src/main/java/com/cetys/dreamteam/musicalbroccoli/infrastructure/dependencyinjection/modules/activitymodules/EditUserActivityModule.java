package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules;

import android.databinding.DataBindingUtil;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.business.connectors.contracts.UserConnector;
import com.cetys.dreamteam.musicalbroccoli.databinding.EditUserActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.EditUserViewModelImpl;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.EditUserViewModelImplValidator;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.EditUserViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.EditUserActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Octavio on 2016/11/21.
 */
@Module
public class EditUserActivityModule {
    private EditUserActivity activity;

    public EditUserActivityModule(EditUserActivity activity) {
        this.activity = activity;
    }

    @ActivityScope
    @Provides
    EditUserActivity providesEditUserActivity() {
        return this.activity;
    }

    @ActivityScope
    @Provides
    EditUserViewModel providesEditUserViewModel(UserConnector connector, EditUserViewModelImplValidator validator) {
        return new EditUserViewModelImpl(this.activity, connector, validator);
    }

    @ActivityScope
    @Provides
    EditUserActivityBinding providesEditUserActivityBinding() {
        return DataBindingUtil.setContentView(this.activity, R.layout.edit_user_activity);
    }

    @ActivityScope
    @Provides
    EditUserViewModelImplValidator providesEditUserViewModelValidator(){
        return new EditUserViewModelImplValidator(this.activity);
    }
}
