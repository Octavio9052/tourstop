package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

/**
 * Created by Octavio on 2016/10/24.
 */

public class TourDTO {
    private int id;
    private String dateCreated;
    private String dateModified;
    private String title;
    private String description;
    private int pricePerReservation;
    private int maxReservations;
    private AddressDTO departurePlace;
    private AddressDTO placeVisiting;
    private AddressDTO finishPlace;
    private UserDTO userDTO;

    public TourDTO(int id, String dateCreated, String dateModified, String title, String description, int pricePerReservation, int maxReservations, AddressDTO departurePlace, AddressDTO placeVisiting, AddressDTO finishPlace, UserDTO userDTO) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.title = title;
        this.description = description;
        this.pricePerReservation = pricePerReservation;
        this.maxReservations = maxReservations;
        this.departurePlace = departurePlace;
        this.placeVisiting = placeVisiting;
        this.finishPlace = finishPlace;
        this.userDTO = userDTO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
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

    public int getPricePerReservation() {
        return pricePerReservation;
    }

    public void setPricePerReservation(int pricePerReservation) {
        this.pricePerReservation = pricePerReservation;
    }

    public int getMaxReservations() {
        return maxReservations;
    }

    public void setMaxReservations(int maxReservations) {
        this.maxReservations = maxReservations;
    }

    public AddressDTO getDeparturePlace() {
        return departurePlace;
    }

    public void setDeparturePlace(AddressDTO departurePlace) {
        this.departurePlace = departurePlace;
    }

    public AddressDTO getPlaceVisiting() {
        return placeVisiting;
    }

    public void setPlaceVisiting(AddressDTO placeVisiting) {
        this.placeVisiting = placeVisiting;
    }

    public AddressDTO getFinishPlace() {
        return finishPlace;
    }

    public void setFinishPlace(AddressDTO finishPlace) {
        this.finishPlace = finishPlace;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }
}