package com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request;

/**
 * @Author J. Pichardo on 11/11/2016.
 */
public abstract class BaseRequest {

    private String authToken;

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
}
