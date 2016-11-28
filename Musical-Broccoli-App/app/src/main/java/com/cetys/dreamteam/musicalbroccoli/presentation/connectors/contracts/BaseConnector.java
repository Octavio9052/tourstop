package com.cetys.dreamteam.musicalbroccoli.presentation.connectors.contracts;

import android.databinding.ObservableArrayList;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.BaseModel;

/**
 * @Author J. Pichardo on 11/28/2016.
 */

public interface BaseConnector< TModel extends BaseModel > {

    TModel getById( int id );

    ObservableArrayList< TModel > getAll();

    ObservableArrayList< TModel > getByFilter(); //TODO: Finish this

    boolean create( TModel model );

    boolean update( TModel model );
}
