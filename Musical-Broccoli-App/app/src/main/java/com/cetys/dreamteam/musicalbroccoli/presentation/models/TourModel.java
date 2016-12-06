package com.cetys.dreamteam.musicalbroccoli.presentation.models;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableFloat;
import android.databinding.ObservableInt;

import java.util.Date;

/**
 * Created by Octavio on 2016/11/12.
 */
public class TourModel extends BaseModel {

    //<editor-fold desc="Instance Properties" defaulstate="collapsed">
    private ObservableInt id;
    private ObservableField<String> title;
    private ObservableInt maxReservations;
    private ObservableFloat pricePerReservation;
    private ObservableBoolean status;
    private Date dateModified;
    private Date dateCreated;
    private ObservableInt userId;
    private ObservableField<String> description;


    private ObservableArrayList<ReservationModel> reservations;

    private ObservableArrayList<RatingModel> ratings;

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Property Accessors">
    public String getDescription() {
        return description.get();
    }

    public void setDescription(String description) {
        if (this.description == null)
            this.description = new ObservableField<>(description);
        else
            this.description.set(description);
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

    public String getTitle() {
        return title.get();
    }

    public void setTitle(String title) {
        if (this.title == null)
            this.title = new ObservableField<>(title);
        else
            this.title.set(title);
    }

    public int getMaxReservations() {
        return maxReservations.get();
    }

    public void setMaxReservations(int maxReservations) {
        if (this.maxReservations == null)
            this.maxReservations = new ObservableInt(maxReservations);
        else
            this.maxReservations.set(maxReservations);
    }

    public float getPricePerReservation() {
        return pricePerReservation.get();
    }

    public void setPricePerReservation(float pricePerReservation) {
        if (this.pricePerReservation == null)
            this.pricePerReservation = new ObservableFloat(pricePerReservation);
        else
            this.pricePerReservation.set(pricePerReservation);
    }

    public boolean getStatus() {
        return status.get();
    }

    public void setStatus(boolean status) {
        if (this.status == null)
            this.status = new ObservableBoolean(status);
        else
            this.status.set(status);
    }

    public int getUserId() {
        return userId.get();
    }

    public void setUserId(int userId) {
        if (this.userId == null)
            this.userId = new ObservableInt(userId);
        else
            this.userId.set(userId);
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

    public ObservableArrayList<RatingModel> getRatings() {
        return ratings;
    }

    public void setRatings(ObservableArrayList<RatingModel> ratings) {
        this.ratings = ratings;
    }

    public ObservableArrayList<ReservationModel> getReservations() {
        return reservations;
    }

    public void setReservations(ObservableArrayList<ReservationModel> reservations) {
        this.reservations = reservations;
    }
    //</editor-fold>
}
