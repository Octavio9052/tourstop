package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

/**
 * Created by Octavio on 2016/11/12.
 */

public class RatingDto {
    private int id;
    private int rating_value;
    private String comment;
    private int userId;
    private int tourId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRating_value() {
        return rating_value;
    }

    public void setRating_value(int rating_value) {
        this.rating_value = rating_value;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }
}
