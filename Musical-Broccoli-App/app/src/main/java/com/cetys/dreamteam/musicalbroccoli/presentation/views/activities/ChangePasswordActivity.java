package com.cetys.dreamteam.musicalbroccoli.presentation.views.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.TourStopApplication;
import com.cetys.dreamteam.musicalbroccoli.databinding.ChangePasswordActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.ChangePasswordActivityModule;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.ChangePasswordViewModel;

import javax.inject.Inject;

public class ChangePasswordActivity extends BaseActivity {

    @Inject
    ChangePasswordViewModel viewModel;
    @Inject
    ChangePasswordActivityBinding binding;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.change_password_activity );

        initActivityComponent();
        initBinding();
    }

    @Override
    protected void initActivityComponent() {
        TourStopApplication.get( this ).getAppComponent()
                .plus( new ChangePasswordActivityModule( this ) ).inject( this );
    }

    @Override
    protected void initBinding() {
        binding.setViewModel( viewModel );
    }

    // TODO: BORRAR/CAMBIAR ESTO
    public void doTemporalToastThing( View view ) {
        Toast.makeText( ChangePasswordActivity.this, "Your password has been changed successfully",
                Toast.LENGTH_LONG ).show();
        Intent intent = new Intent( ChangePasswordActivity.this, UserProfileActivity.class );
        ChangePasswordActivity.this.startActivity( intent );
    }
}
