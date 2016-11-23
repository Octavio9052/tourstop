package com.cetys.dreamteam.musicalbroccoli.presentation.views.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.R;

public class PaymentOptionsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_options_activity);
    }

    @Override
    protected void initActivityComponent() {

    }

    @Override
    protected void initBinding() {

    }

    // TODO: Temp stuff below.
    public void doTemporalToastThing(View view) {
        Toast.makeText(PaymentOptionsActivity.this, "Your changes has been registered successfully",
                Toast.LENGTH_LONG).show();
        Intent intent = new Intent(PaymentOptionsActivity.this, UserProfileActivity.class);
        PaymentOptionsActivity.this.startActivity(intent);
    }

    public void goToCardPaymentActivity(View view) {
        Intent intent = new Intent(PaymentOptionsActivity.this, CardPaymentActivity.class);
        PaymentOptionsActivity.this.startActivity(intent);
    }
}
