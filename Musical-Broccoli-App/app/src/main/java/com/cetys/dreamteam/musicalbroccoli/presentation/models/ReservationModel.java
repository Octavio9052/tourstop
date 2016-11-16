package com.cetys.dreamteam.musicalbroccoli.presentation.models;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableInt;

import java.util.Date;

/**
 * Created by Octavio on 2016/11/12.
 */

public class ReservationModel extends BaseModel {
    private ObservableInt id;
    private String name;
    private Date dateCreated;
    private ObservableInt userId;
    private ObservableInt tourId;
    private ObservableInt orderId;
    private ObservableBoolean status;

    public ObservableInt getId() {
        return id;
    }

    public void setId(ObservableInt id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public ObservableInt getUserId() {
        return userId;
    }

    public void setUserId(ObservableInt userId) {
        this.userId = userId;
    }

    public ObservableInt getTourId() {
        return tourId;
    }

    public void setTourId(ObservableInt tourId) {
        this.tourId = tourId;
    }

    public ObservableInt getOrderId() {
        return orderId;
    }

    public void setOrderId(ObservableInt orderId) {
        this.orderId = orderId;
    }

    public ObservableBoolean getStatus() {
        return status;
    }

    public void setStatus(ObservableBoolean status) {
        this.status = status;
    }
}
