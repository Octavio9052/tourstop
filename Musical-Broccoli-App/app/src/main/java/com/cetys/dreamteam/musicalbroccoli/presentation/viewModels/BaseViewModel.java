package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.databinding.BaseObservable;

/**
 * @Author J. Pichardo on 11/11/2016.
 */

public abstract class BaseViewModel extends BaseObservable {
    protected final Context context;

    public BaseViewModel(Context context) {
        this.context = context;
    }

    protected abstract void load();

}
