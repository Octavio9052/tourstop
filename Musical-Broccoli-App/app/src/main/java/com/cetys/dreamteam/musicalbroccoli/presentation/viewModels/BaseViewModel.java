package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;

/**
 * @Author J. Pichardo on 11/11/2016.
 */

public abstract class BaseViewModel {
    protected final Context context;

    public BaseViewModel(Context context) {
        this.context = context;
    }

    protected abstract void initCallbacks();
}
