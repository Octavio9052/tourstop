package com.cetys.dreamteam.musicalbroccoli.presentation.models;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

import java.util.Date;

/**
 * Created by Octavio on 2016/11/12.
 */

public class MessageModel extends BaseModel {
    private ObservableInt id;
    private ObservableInt senderId;
    private Date dateCreated;
    private ObservableField<String> content;

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getId(){
        return id.get();
    }

    public void setId(int id){
        if(this.id == null)
            this.id = new ObservableInt(id);
        else
            this.id.set(id);
    }

    public int getSenderId(){
        return senderId.get();
    }

    public void setSenderId(int senderId){
        if(this.senderId == null)
            this.senderId = new ObservableInt(senderId);
        else
            this.senderId.set(senderId);
    }

    public String getContent(){
        return content.get();
    }

    public void setContent(String content){
        if(this.content == null)
            this.content = new ObservableField<>(content);
        else
            this.content.set(content);
    }

}
