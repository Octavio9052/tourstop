package com.cetys.dreamteam.musicalbroccoli.presentation.views.activities;

import android.os.Bundle;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.databinding.CreateTourActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.CreateTourViewModel;

import javax.inject.Inject;

public class CreateTourActivity extends BaseActivity {

    @Inject
    CreateTourActivityBinding binding;
    @Inject
    CreateTourViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_tour_activity);

        initActivityComponent();
        initBinding();
    }

    @Override
    protected void initActivityComponent() {
    }

    @Override
    protected void initBinding() {

    }
}
