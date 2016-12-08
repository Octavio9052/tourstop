package com.cetys.dreamteam.musicalbroccoli.presentation.models;

import android.databinding.ObservableInt;

import com.cetys.dreamteam.musicalbroccoli.commons.enums.MovementType;

import java.util.Date;

/**
 * Created by Octavio on 2016/11/12.
 */
public class Movement extends BaseModel {

    //<editor-fold defaultstate="collapsed" desc="Instance Properties">
    private ObservableInt id;
    private MovementType movementType;
    private Date dateCreated;
    private ObservableInt tourId;
    private ObservableInt reservationId;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Property Accessors">
    public MovementType getMovementType() {
        return movementType;
    }

    public void setMovementType(MovementType movementType) {
        this.movementType = movementType;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        if (this.id == null)
            this.id = new ObservableInt(id);
        else
            this.id.set(id);
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

    public int getReservationId() {
        return reservationId.get();
    }

    public void setReservationId(int reservationId) {
        if (this.reservationId == null)
            this.reservationId = new ObservableInt(reservationId);
        else
            this.reservationId.set(reservationId);
    }
    //</editor-fold>

}
