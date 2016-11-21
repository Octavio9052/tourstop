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

    public void setId(int id){
        if(this.id == null)
            this.id = new ObservableInt(id);
        else
            this.id.set(id);
    }

    public int getId(){
        return id.get();
    }

    public void setAddressId(int addressId){
        if(this.addressId == null)
            this.addressId = new ObservableInt(addressId);
        else
            this.addressId.set(addressId);
    }

    public int getAddressId(){
        return addressId.get();
    }

    public void setTourId(int tourId){
        if(this.tourId == null)
            this.tourId = new ObservableInt(tourId);
        else
            this.tourId.set(tourId);
    }

    public int getTourId(){
        return tourId.get();
    }
}
