package com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.builders;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.UserScope;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.ReadWriteRequest;
import com.cetys.dreamteam.musicalbroccoli.core.models.Session;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * @Author J. Pichardo on 12/7/2016.
 */
@UserScope
public class ReadWriteRequestBuilder<T> extends RequestBuilder<ReadWriteRequest<T>> {

    @Inject
    public ReadWriteRequestBuilder(Session session) {
        super(session);
    }

    public ReadWriteRequestBuilder<T> addData(T data) {
        if (request == null) request = new ReadWriteRequest<>();
        if (request.getData() == null) request.setData(new ArrayList<T>());

        request.getData().add(data);

        return this;
    }

    public ReadWriteRequestBuilder<T> addAllData(List<T> data) {
        if (request == null) request = new ReadWriteRequest<>();
        if (request.getData() == null) request.setData(new ArrayList<T>());

        request.getData().addAll(data);

        return this;
    }
}
