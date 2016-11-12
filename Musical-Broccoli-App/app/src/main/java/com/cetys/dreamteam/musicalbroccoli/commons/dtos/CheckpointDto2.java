package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

import java.util.Date;

/**
 * Created by Octavio on 2016/11/12.
 */

public class CheckpointDto2 {
    private int id;
    private Date startTime;
    private Date endTime;
    private int addressId;
    private int tourId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }
}
