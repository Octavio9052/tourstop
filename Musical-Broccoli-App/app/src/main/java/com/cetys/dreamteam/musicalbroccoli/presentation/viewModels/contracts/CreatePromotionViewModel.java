package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts;

import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.Promotion;

/**
 * Created by Octavio on 2016/12/04.
 */

public interface CreatePromotionViewModel {
    Promotion getPromotion();

    void setPromotion(Promotion promotion);

    void onSaveChangesClick(View view);

    void onCancelClick(View view);
}
