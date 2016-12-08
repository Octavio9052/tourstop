package com.cetys.dreamteam.musicalbroccoli.business.connectors.contracts;

import com.cetys.dreamteam.musicalbroccoli.core.models.BaseModel;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.Filter;

import java.io.IOException;
import java.util.List;

/**
 * @Author J. Pichardo on 12/7/2016.
 */

public interface BaseConnector<T extends BaseModel> {


    public abstract List<T> getAll() throws IOException;

    public abstract T getById(int id) throws IOException;

    public abstract List<T> getByFilters(List<Filter> filters) throws IOException;

    public abstract void create(T model);

    public abstract void update(T model);

    public abstract void delete(T model);
}
