package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;

import com.cetys.dreamteam.musicalbroccoli.presentation.connectors.BaseConnector;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.BaseModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.BaseModelViewModel;

/**
 * @Author J. Pichardo on 12/5/2016.
 */

abstract class BaseModelViewModelImpl<T extends BaseModel> extends BaseViewModel implements BaseModelViewModel<T> {

    //<editor-fold desc="Instance Properties" defaultstate="collapsed">
    protected BaseConnector<T> connector;
    protected T model;
    //</editor-fold>

    BaseModelViewModelImpl(Context context, BaseConnector<T> connector) {
        super(context);
        this.connector = connector;
    }

    //<editor-fold desc="Property Accessors" defaulstate="collapsed">
    public T getModel() {
        return model;
    }

    public BaseModelViewModelImpl<T> setModel(T model) {
        this.model = model;
        return this;
    }
    //</editor-fold>

}