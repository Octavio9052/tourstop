package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

import java.util.Date;

/**
 * Created by Octavio on 2016/10/24.
 */

public class TourDto {
    private int id;
    private String title;
    private String description;
    private int maxReservations;
    private int pricePerReservation;
    private Date dateCreated;
    private Date dateModified;
    private UserDto userDto;        // User_id

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMaxReservations() {
        return maxReservations;
    }

    public void setMaxReservations(int maxReservations) {
        this.maxReservations = maxReservations;
    }

    public int getPricePerReservation() {
        return pricePerReservation;
    }

    public void setPricePerReservation(int pricePerReservation) {
        this.pricePerReservation = pricePerReservation;
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

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public TourDto(int id, String title, String description, int maxReservations, int pricePerReservation, Date dateCreated, Date dateModified, UserDto userDto) {

        this.id = id;
        this.title = title;
        this.description = description;
        this.maxReservations = maxReservations;
        this.pricePerReservation = pricePerReservation;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.userDto = userDto;
    }
}