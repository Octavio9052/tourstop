package com.cetys.dreamteam.musicalbroccoli.presentation.models;

import android.databinding.ObservableInt;

import java.util.Date;

/**
 * Created by Octavio on 2016/11/12.
 */

public class MessageModel extends BaseModel {
    private ObservableInt id;
    private ObservableInt senderId;
    private Date dateCreated;
    private String content;

    public ObservableInt getId() {
        return id;
    }

    public void setId(ObservableInt id) {
        this.id = id;
    }

    public ObservableInt getSenderId() {
        return senderId;
    }

    public void setSenderId(ObservableInt senderId) {
        this.senderId = senderId;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
