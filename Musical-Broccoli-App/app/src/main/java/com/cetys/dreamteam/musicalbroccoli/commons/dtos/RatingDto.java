package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

/**
 * Created by Octavio on 2016/11/12.
 */

public class RatingDto {
    private int id;
    private int rating_value;
    private String comment;
    private UserDto user_id;
    private TourDto tour_id;

    public RatingDto(int id, int rating_value, String comment, UserDto user_id, TourDto tour_id) {
        this.id = id;
        this.rating_value = rating_value;
        this.comment = comment;
        this.user_id = user_id;
        this.tour_id = tour_id;
    }

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

    public UserDto getUser_id() {
        return user_id;
    }

    public void setUser_id(UserDto user_id) {
        this.user_id = user_id;
    }

    public TourDto getTour_id() {
        return tour_id;
    }

    public void setTour_id(TourDto tour_id) {
        this.tour_id = tour_id;
    }
}
