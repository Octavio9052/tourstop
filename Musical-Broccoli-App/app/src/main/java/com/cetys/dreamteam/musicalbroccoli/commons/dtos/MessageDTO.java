package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

/**
 * Created by Octavio on 2016/10/24.
 */

public class MessageDTO {

    private int id;
    private UserDTO userDTOFrom;      // Sender
    private UserDTO userDTOTo;        // Addressee, Receiver
    private String dateCreated;

    public MessageDTO(int id, UserDTO userDTOFrom, UserDTO userDTOTo, String dateCreated) {
        this.id = id;
        this.userDTOFrom = userDTOFrom;
        this.userDTOTo = userDTOTo;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserDTO getUserDTOFrom() {
        return userDTOFrom;
    }

    public void setUserDTOFrom(UserDTO userDTOFrom) {
        this.userDTOFrom = userDTOFrom;
    }

    public UserDTO getUserDTOTo() {
        return userDTOTo;
    }

    public void setUserDTOTo(UserDTO userDTOTo) {
        this.userDTOTo = userDTOTo;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}