package com.cetys.dreamteam.musicalbroccoli.core.models;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

import java.util.Date;

/**
 * Created by Octavio on 2016/11/12.
 */
public class Reservation extends BaseModel {

    //<editor-fold defaultstate="collapsed" desc="Instance Properties">
    private ObservableInt id;
    private ObservableField<String> name;
    private Date dateCreated;
    private ObservableInt userId;
    private ObservableInt tourId;
    private ObservableInt orderId;
    private ObservableBoolean status;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Property Accessors">
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getInt() {
        return id.get();
    }

    public void setId(int id) {
        if (this.id == null)
            this.id = new ObservableInt(id);
        else
            this.id.set(id);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        if (this.name == null)
            this.name = new ObservableField<>(name);
        else
            this.name.set(name);
    }

    public int getUserId() {
        return id.get();
    }

    public void setUserId(int userId) {
        if (this.userId == null)
            this.userId = new ObservableInt(userId);
        else
            this.userId.set(userId);
    }

    public int getTourId() {
        return tourId.get();
    }

    public void setTourId(int tourId) {
        if (this.tourId == null)
            this.tourId = new ObservableInt(tourId);
        else
            this.tourId.set(tourId);
    }

    public int getOrderId() {
        return orderId.get();
    }

    public void setOrderId(int orderId) {
        if (this.orderId == null)
            this.orderId = new ObservableInt(orderId);
        else
            this.orderId.set(orderId);
    }

    public boolean getStatus() {
        return status.get();
    }

    public void setStatus(boolean status) {
        if (this.status == null)
            this.status = new ObservableBoolean(status);
        else
            this.status.set(status);
    }
    //</editor-fold>

}
