package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts;

import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.TourModel;

/**
 * Created by Octavio on 2016/11/20.
 */

public interface CreateTourViewModel extends BaseModelViewModel<TourModel> {

    void onSaveClick(View view);

    void onPromotionClick(View view);

    void onCheckpointsClick(View view);
}
