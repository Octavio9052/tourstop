package com.cetys.dreamteam.musicalbroccoli.presentation.connectors.contracts;

import android.databinding.ObservableArrayList;

import com.cetys.dreamteam.musicalbroccoli.networking.request.Filter;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.BaseModel;

import java.util.List;

/**
 * @Author J. Pichardo on 11/28/2016.
 */

public interface BaseConnector<TModel extends BaseModel> {

    TModel getById(int id);

    ObservableArrayList<TModel> getByFilters(List<Filter> filters);

    ObservableArrayList<TModel> getAll();

    TModel create(TModel model);

    boolean update(TModel model);

    boolean delete(TModel model);
}
