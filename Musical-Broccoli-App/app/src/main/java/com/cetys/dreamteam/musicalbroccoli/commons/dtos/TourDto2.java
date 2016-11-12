package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

import java.util.Date;
import java.util.List;

/**
 * Created by Octavio on 2016/10/24.
 */

public class TourDto2 {
    private int id;
    private String title;
    private int maxReservations;
    private float pricePerReservation;
    private boolean status;
    private Date dateModified;
    private Date dateCreated;
    private int promotionId;
    private int userId;

    private List<ReservationDto2> reservations;
    private List<RatingDto2> ratings;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMaxReservations() {
        return maxReservations;
    }

    public void setMaxReservations(int maxReservations) {
        this.maxReservations = maxReservations;
    }

    public float getPricePerReservation() {
        return pricePerReservation;
    }

    public void setPricePerReservation(float pricePerReservation) {
        this.pricePerReservation = pricePerReservation;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
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

    public int getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(int promotionId) {
        this.promotionId = promotionId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<ReservationDto2> getReservations() {
        return reservations;
    }

    public void setReservations(List<ReservationDto2> reservations) {
        this.reservations = reservations;
    }

    public List<RatingDto2> getRatings() {
        return ratings;
    }

    public void setRatings(List<RatingDto2> ratings) {
        this.ratings = ratings;
    }
}