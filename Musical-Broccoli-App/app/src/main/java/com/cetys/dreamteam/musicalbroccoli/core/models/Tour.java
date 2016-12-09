package com.cetys.dreamteam.musicalbroccoli.core.models;

import android.databinding.ObservableArrayList;

import java.util.Date;

/**
 * Created by Octavio on 2016/11/12.
 */
public class Tour extends BaseModel {

    //<editor-fold desc="Instance Properties" defaulstate="collapsed">
    private int id;
    private String title;
    private int maxReservations;
    private float pricePerReservation;
    private boolean status;
    private Date dateModified;
    private Date dateCreated;
    private int userId;
    private String description;


    private ObservableArrayList<Reservation> reservations;
    private ObservableArrayList<Rating> ratings;

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Property Accessors">
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {

        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public ObservableArrayList<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(ObservableArrayList<Rating> ratings) {
        this.ratings = ratings;
    }

    public ObservableArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(ObservableArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }
    //</editor-fold>
}
