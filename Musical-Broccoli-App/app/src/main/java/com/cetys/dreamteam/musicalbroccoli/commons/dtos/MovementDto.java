package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

import com.cetys.dreamteam.musicalbroccoli.commons.enums.MovementType;

import java.util.Date;

/**
 * Created by Octavio on 2016/11/12.
 */

public class MovementDto {
    private int id;
    private MovementType movementType;
    private Date dateCreated;
    private TourDto tour_id;
    private ReservationDto reservation_id;

    public MovementDto(Date dateCreated, MovementType movementType, int id, TourDto tour_id, ReservationDto reservation_id) {
        this.dateCreated = dateCreated;
        this.movementType = movementType;
        this.id = id;
        this.tour_id = tour_id;
        this.reservation_id = reservation_id;
    }

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

    public TourDto getTour_id() {
        return tour_id;
    }

    public void setTour_id(TourDto tour_id) {
        this.tour_id = tour_id;
    }

    public ReservationDto getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(ReservationDto reservation_id) {
        this.reservation_id = reservation_id;
    }
}
