package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

/**
 * Created by Octavio on 2016/10/24.
 */

public class ReservationDTO {
    private int id;
    private String dateCreated;
    private UserDTO userDTO;
    private TourDTO tourDTO;

    public ReservationDTO(int id, String dateCreated, UserDTO userDTO, TourDTO tourDTO) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.userDTO = userDTO;
        this.tourDTO = tourDTO;
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

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public TourDTO getTourDTO() {
        return tourDTO;
    }

    public void setTourDTO(TourDTO tourDTO) {
        this.tourDTO = tourDTO;
    }
}
