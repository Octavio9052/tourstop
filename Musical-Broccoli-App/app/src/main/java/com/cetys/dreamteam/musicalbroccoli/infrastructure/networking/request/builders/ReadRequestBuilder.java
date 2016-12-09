package com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.builders;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.UserScope;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.Filter;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.ReadRequest;
import com.cetys.dreamteam.musicalbroccoli.core.models.Session;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * @Author J. Pichardo on 12/7/2016.
 */
@UserScope
public class ReadRequestBuilder extends RequestBuilder<ReadRequest> {
    @Inject
    public ReadRequestBuilder(Session session) {
        super(session);
    }

    public ReadRequestBuilder addFilter(Filter filter) {

        if (request == null) request = new ReadRequest();
        if (request.getFilters() == null) request.setFilters(new ArrayList<Filter>());

        request.getFilters().add(filter);

        return this;
    }

    public ReadRequestBuilder addFilters(List<Filter> filters) {

        if (request == null) request = new ReadRequest();
        if (request.getFilters() == null) request.setFilters(new ArrayList<Filter>());

        request.getFilters().addAll(filters);

        return this;
    }
}
