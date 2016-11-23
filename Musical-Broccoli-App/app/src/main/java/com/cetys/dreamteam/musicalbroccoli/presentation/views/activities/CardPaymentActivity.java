package com.cetys.dreamteam.musicalbroccoli.presentation.views.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.R;

public class CardPaymentActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_payment_activity);
    }

    @Override
    protected void initActivityComponent() {

    }

    @Override
    protected void initBinding() {

    }

    public void doToast(View view) {
        Toast.makeText(CardPaymentActivity.this, "You have added a new card successfully",
                Toast.LENGTH_LONG).show();
        Intent intent = new Intent(CardPaymentActivity.this, UserProfileActivity.class);
        CardPaymentActivity.this.startActivity(intent);
    }
}
