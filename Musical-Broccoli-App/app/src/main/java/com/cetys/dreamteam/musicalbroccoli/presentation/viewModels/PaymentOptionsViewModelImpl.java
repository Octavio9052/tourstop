package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.PaymentOptionsViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.CardPaymentActivity;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.EditUserActivity;

/**
 * @Author J. Pichardo on 11/23/2016.
 */

public class PaymentOptionsViewModelImpl extends BaseViewModel implements PaymentOptionsViewModel {
    boolean isCreditCardPaymentSelected;
    boolean isPromoterPaymentSelected;

    public PaymentOptionsViewModelImpl(Context context) {
        super(context);
    }

    @Override
    protected void load() {

    }

    @Override
    public void onProceedClick(View view) {
        if (isCreditCardPaymentSelected) {
            Intent intent = new Intent(context, CardPaymentActivity.class);
            context.startActivity(intent);
        } else {
            doToastTemporalThing();
            Intent intent = new Intent(context, EditUserActivity.class);
            context.startActivity(intent);
        }
    }

    @Override
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.creditCardPaymentButton:
                isCreditCardPaymentSelected = checked;
                isPromoterPaymentSelected = !checked;
                break;
            case R.id.promoterPaymentButton:
                isPromoterPaymentSelected = checked;
                isCreditCardPaymentSelected = !checked;
                break;
        }
    }

    public void doToastTemporalThing() {
        Toast.makeText(context, "Your changes has been registered successfully", Toast.LENGTH_LONG)
                .show();
    }
}
