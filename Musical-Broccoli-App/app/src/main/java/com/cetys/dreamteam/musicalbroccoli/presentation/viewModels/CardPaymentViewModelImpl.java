package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.CardPaymentViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.EditUserActivity;

/**
 * @Author J. Pichardo on 11/23/2016.
 */

public class CardPaymentViewModelImpl extends BaseViewModel implements CardPaymentViewModel {
    boolean master, visa, amex;

    public CardPaymentViewModelImpl(Context context) {
        super(context);
    }

    @Override
    protected void load() {

    }

    @Override
    public void onRadioButtonClick(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Temp solution
        switch (view.getId()) {
            case R.id.button_amex:
                changeStates(checked, !checked, !checked);
                break;
            case R.id.button_master_card:
                changeStates(!checked, checked, !checked);
                break;
            case R.id.button_visa:
                changeStates(!checked, !checked, checked);
                break;
        }
    }

    private void changeStates(boolean amex, boolean master, boolean visa) {
        this.amex = amex;
        this.master = master;
        this.visa = visa;
    }

    @Override
    public void onSaveChangesClick(View view) {
        doTemporalToast();
        Intent intent = new Intent(context, EditUserActivity.class);
        context.startActivity(intent);

    }

    private void doTemporalToast() {
        Toast.makeText(context, "You have added a new card sucessfully", Toast.LENGTH_LONG).show();
    }
}
