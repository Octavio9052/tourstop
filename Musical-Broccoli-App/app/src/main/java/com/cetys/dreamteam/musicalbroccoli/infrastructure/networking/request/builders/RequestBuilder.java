package com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.builders;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.BaseRequest;
import com.cetys.dreamteam.musicalbroccoli.core.models.Session;

/**
 * @Author J. Pichardo on 12/7/2016.
 */

public abstract class RequestBuilder<T extends BaseRequest> {

    private final Session session;
    protected T request;

    public RequestBuilder(Session session) {
        this.session = session;
    }

    public T build() {
        request.setAuthToken(session.getAuthToken());
        return request;
    }

}
