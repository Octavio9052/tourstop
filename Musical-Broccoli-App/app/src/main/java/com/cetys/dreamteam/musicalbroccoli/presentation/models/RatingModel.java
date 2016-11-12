package com.cetys.dreamteam.musicalbroccoli.presentation.models;

import android.databinding.ObservableInt;

/**
 * Created by Octavio on 2016/11/12.
 */

public class RatingModel extends BaseModel {
    private ObservableInt id;
    private ObservableInt ratingValue;
    private String comment;
    private ObservableInt userId;
    private ObservableInt tourId;

    public ObservableInt getId() {
        return id;
    }

    public void setId(ObservableInt id) {
        this.id = id;
    }

    public ObservableInt getRatingValue() {
        return ratingValue;
    }

    public void setRatingValue(ObservableInt ratingValue) {
        this.ratingValue = ratingValue;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ObservableInt getUserId() {
        return userId;
    }

    public void setUserId(ObservableInt userId) {
        this.userId = userId;
    }

    public ObservableInt getTourId() {
        return tourId;
    }

    public void setTourId(ObservableInt tourId) {
        this.tourId = tourId;
    }
}
