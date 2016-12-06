package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

import com.cetys.dreamteam.musicalbroccoli.commons.enums.MovementType;

import java.util.Date;

/**
 * Created by Octavio on 2016/11/12.
 */

public class MovementDto {

    //<editor-fold defaultstate="collapsed" desc="Instance Properties">
    private int id;
    private MovementType movementType;
    private Date dateCreated;
    private int tourId;
    private int reservationId;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Property Accessors">
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }
    //</editor-fold>

}
