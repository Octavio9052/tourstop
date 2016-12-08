package com.cetys.dreamteam.musicalbroccoli.core.models;

import java.util.Date;

/**
 * @Author J. Pichardo on 12/7/2016.
 */

public class Session extends BaseModel {

    private int userId;
    private String authToken;
    private Date dateCreated;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
