package com.cetys.dreamteam.musicalbroccoli.presentation.connectors;

import com.cetys.dreamteam.musicalbroccoli.networking.request.Filter;
import com.cetys.dreamteam.musicalbroccoli.networking.request.builders.ReadRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.networking.request.builders.ReadWriteRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.BaseModel;

import java.io.IOException;
import java.util.List;

/**
 * @Author J. Pichardo on 12/7/2016.
 */

public abstract class BaseConnector<T extends BaseModel> {

    protected final ReadWriteRequestBuilder<T> readWriteRequestBuilder;
    protected final ReadRequestBuilder readRequestBuilder;

    protected BaseConnector(ReadWriteRequestBuilder<T> readWriteRequestBuilder,
                            ReadRequestBuilder readRequestBuilder) {
        this.readWriteRequestBuilder = readWriteRequestBuilder;
        this.readRequestBuilder = readRequestBuilder;

        initCallbacks();
    }

    protected abstract void initCallbacks();

    public abstract List<T> getAll() throws IOException;

    public abstract T getById(int id) throws IOException;

    public abstract List<T> getByFilters(List<Filter> filters) throws IOException;

    public abstract void create(T model);

    public abstract void update(T model);

    public abstract void delete(T model);
}
