package com.cetys.dreamteam.musicalbroccoli.presentation.views.activities;

import android.os.Bundle;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.TourStopApplication;
import com.cetys.dreamteam.musicalbroccoli.databinding.EditUserActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.EditUserActivityModule;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.EditUserViewModel;

import javax.inject.Inject;

public class EditUserActivity extends BaseActivity {

    @Inject
    EditUserActivityBinding binding;
    @Inject
    EditUserViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_user_activity);

        initActivityComponent();
        initBinding();
    }

    @Override
    protected void initActivityComponent() {
        TourStopApplication.get(this).getUserSubcomponent()
                .plus(new EditUserActivityModule(this))
                .inject(this);
    }

    @Override
    protected void initBinding() {
        binding.setViewModel(viewModel);
    }
}
