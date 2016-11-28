package com.cetys.dreamteam.musicalbroccoli.presentation.connectors;

import android.databinding.ObservableArrayList;

import com.cetys.dreamteam.musicalbroccoli.commons.dtos.BaseDto;
import com.cetys.dreamteam.musicalbroccoli.networking.services.contracts.BaseService;
import com.cetys.dreamteam.musicalbroccoli.presentation.connectors.contracts.BaseConnector;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.BaseModel;

/**
 * @Author J. Pichardo on 11/11/2016.
 */

public abstract class BaseConnectorImpl< TModel extends BaseModel, TDto extends BaseDto, TService >
        implements BaseConnector< TModel > {

    protected BaseService< TDto > service;

    public BaseConnectorImpl(
            BaseService< TDto > service ) {
        this.service = service;
    }

    @Override

    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public TModel getById( int id ) {
        return null;
    }

    @Override
    public ObservableArrayList< TModel > getAll() {
        return null;
    }

    @Override
    public ObservableArrayList< TModel > getByFilter() {
        return null;
    }

    @Override
    public boolean create( TModel model ) {
        return false;
    }

    @Override
    public boolean update( TModel model ) {
        return false;
    }
}
