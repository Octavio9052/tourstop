package com.cetys.dreamteam.musicalbroccoli.presentation.models;

import android.databinding.ObservableInt;

import com.cetys.dreamteam.musicalbroccoli.commons.enums.MovementType;

import java.util.Date;

/**
 * Created by Octavio on 2016/11/12.
 */

public class MovementModel extends BaseModel {
    private ObservableInt id;
    private MovementType movementType;
    private Date dateCreated;
    private ObservableInt tourId;
    private ObservableInt reservationId;

    public ObservableInt getId() {
        return id;
    }

    public void setId(ObservableInt id) {
        this.id = id;
    }

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

    public ObservableInt getTourId() {
        return tourId;
    }

    public void setTourId(ObservableInt tourId) {
        this.tourId = tourId;
    }

    public ObservableInt getReservationId() {
        return reservationId;
    }

    public void setReservationId(ObservableInt reservationId) {
        this.reservationId = reservationId;
    }
}
