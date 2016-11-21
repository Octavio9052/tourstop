package com.cetys.dreamteam.musicalbroccoli.presentation.views.activities;

import android.os.Bundle;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.databinding.EditProfileActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.EditProfileViewModel;

import javax.inject.Inject;

public class EditProfileActivity extends BaseActivity {

    @Inject
    EditProfileActivityBinding binding;
    @Inject
    EditProfileViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_user_activity);

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
