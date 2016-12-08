package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.core.models.Promotion;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.CreatePromotionViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.CreateTourActivity;

/**
 * Created by Octavio on 2016/12/04.
 */

public class CreatePromotionViewModelImpl extends BaseViewModel implements CreatePromotionViewModel {
    private Promotion promotion;

    public CreatePromotionViewModelImpl(Context context) {
        super(context);
    }

    @Override
    protected void load() {

    }

    @Override
    public Promotion getPromotion() {
        return this.promotion;
    }

    @Override
    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    @Override
    public void onSaveChangesClick(View view) {
        doToast();
        Intent intent = new Intent(context, CreateTourActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onCancelClick(View view) {
        Intent intent = new Intent(context, CreateTourActivity.class);
        context.startActivity(intent);
    }

    private void doToast() {
        Toast.makeText(context, "Promotion created", Toast.LENGTH_LONG).show();
    }
}
