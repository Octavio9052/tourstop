package com.cetys.dreamteam.musicalbroccoli.presentation.models;

import android.databinding.ObservableInt;

import java.util.Date;

/**
 * Created by Octavio on 2016/11/12.
 */

public class CheckpointModel extends BaseModel {
    private ObservableInt id;
    private Date startTime;
    private Date endTime;
    private ObservableInt addressId;
    private ObservableInt tourId;

    public ObservableInt getId() {
        return id;
    }

    public void setId(ObservableInt id) {
        this.id = id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public ObservableInt getAddressId() {
        return addressId;
    }

    public void setAddressId(ObservableInt addressId) {
        this.addressId = addressId;
    }

    public ObservableInt getTourId() {
        return tourId;
    }

    public void setTourId(ObservableInt tourId) {
        this.tourId = tourId;
    }
}
