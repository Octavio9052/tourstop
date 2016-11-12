package com.cetys.dreamteam.musicalbroccoli.presentation.models;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableFloat;
import android.databinding.ObservableInt;

import java.util.Date;

/**
 * Created by Octavio on 2016/11/12.
 */

public class TourModel extends BaseModel {
    private ObservableInt id;
    private String title;
    private ObservableInt maxReservations;
    private ObservableFloat pricePerReservation;
    private ObservableBoolean status;
    private Date dateModified;
    private Date dateCreated;
    private ObservableInt promotionId;
    private ObservableInt userId;

    private ObservableArrayList<ReservationModel> reservations;
    private ObservableArrayList<RatingModel> ratings;

    public ObservableInt getId() {
        return id;
    }

    public void setId(ObservableInt id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ObservableInt getMaxReservations() {
        return maxReservations;
    }

    public void setMaxReservations(ObservableInt maxReservations) {
        this.maxReservations = maxReservations;
    }

    public ObservableFloat getPricePerReservation() {
        return pricePerReservation;
    }

    public void setPricePerReservation(ObservableFloat pricePerReservation) {
        this.pricePerReservation = pricePerReservation;
    }

    public ObservableBoolean getStatus() {
        return status;
    }

    public void setStatus(ObservableBoolean status) {
        this.status = status;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public ObservableInt getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(ObservableInt promotionId) {
        this.promotionId = promotionId;
    }

    public ObservableInt getUserId() {
        return userId;
    }

    public void setUserId(ObservableInt userId) {
        this.userId = userId;
    }

    public ObservableArrayList<ReservationModel> getReservations() {
        return reservations;
    }

    public void setReservations(ObservableArrayList<ReservationModel> reservations) {
        this.reservations = reservations;
    }

    public ObservableArrayList<RatingModel> getRatings() {
        return ratings;
    }

    public void setRatings(ObservableArrayList<RatingModel> ratings) {
        this.ratings = ratings;
    }
}
