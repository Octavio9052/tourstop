package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts;

import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.PromotionModel;

/**
 * Created by Octavio on 2016/12/04.
 */

public interface CreatePromotionViewModel {
    PromotionModel getPromotion();
    void setPromotion(PromotionModel promotion);
    void onSaveChangesClick(View view);
    void onCancelClick(View view);
}
