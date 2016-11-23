package com.cetys.dreamteam.musicalbroccoli.presentation.views.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.TourStopApplication;
import com.cetys.dreamteam.musicalbroccoli.databinding.EditUserActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.EditUserActivityModule;
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
        TourStopApplication.get(this).getAppComponent().plus(new EditUserActivityModule(this)).inject(this);
    }

    @Override
    protected void initBinding() {
        binding.setViewModel(viewModel);
    }

    // TODO: Temp stuff below.
    public void doTemporalToastThing(View view) {
        Toast.makeText(EditUserActivity.this, "Your information has been modified successfully",
                Toast.LENGTH_LONG).show();
        Intent intent = new Intent(EditUserActivity.this, UserProfileActivity.class);
        EditUserActivity.this.startActivity(intent);
    }

    public void goToChangePayment(View view) {
        // GO to PaymentOptionsActivity
        Intent intent = new Intent(EditUserActivity.this, PaymentOptionsActivity.class);
        EditUserActivity.this.startActivity(intent);
    }

    public void goToChangePassword(View view) {
        // GO to ChangePasswordActivity
        Intent intent = new Intent(EditUserActivity.this, ChangePasswordActivity.class);
        EditUserActivity.this.startActivity(intent);
    }
}
