package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

import java.util.Date;
import java.util.List;

/**
 * Created by Octavio on 2016/10/24.
 */

public class MessageModel {

    //<editor-fold defaulstate="collapsed" desc="Instance Properties">
    private int id;                      // Message_id
    private int senderId;               // Sender_id
    private Date dateCreated;            // Date_Created
    private String content;              // Content

    private List<UserDto> receivers;     // Receivers
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Property Accessors">
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
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

    public List<UserDto> getReceivers() {
        return receivers;
    }

    public void setReceivers(List<UserDto> receivers) {
        this.receivers = receivers;
    }
    //</editor-fold>

}