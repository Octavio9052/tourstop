package com.cetys.dreamteam.musicalbroccoli.presentation.views.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.TourStopApplication;
import com.cetys.dreamteam.musicalbroccoli.databinding.CreateTourActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.CreateTourActivityModule;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.CreateTourViewModel;

import javax.inject.Inject;

import static com.cetys.dreamteam.musicalbroccoli.R.id.firstName_editText;

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
        TourStopApplication.get(this).getAppComponent().plus(new CreateTourActivityModule(this)).inject(this);
    }

    @Override
    protected void initBinding() {
        binding.setViewModel(viewModel);
    }

    // TODO: BORRAR/CAMBIAR ESTO
    public void doTemporalToastThing(View view) {
        Toast.makeText(CreateTourActivity.this, "A tour has been created successfully",
                Toast.LENGTH_LONG).show();
    }
}
