package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

import java.util.Date;
import java.util.List;

/**
 * Created by Octavio on 2016/10/24.
 */

public class MessageDto {

    private int id;                     // Message_id
    private UserDto userDtoFrom;        // Sender_id
    private Date dateCreated;         // Date_Created
    private List<UserDto> receivers;    // Receivers
    private String content;             // Content

    public MessageDto(int id, UserDto userDtoFrom, Date dateCreated, List<UserDto> receivers, String content) {
        this.id = id;
        this.userDtoFrom = userDtoFrom;
        this.dateCreated = dateCreated;
        this.receivers = receivers;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserDto getUserDtoFrom() {
        return userDtoFrom;
    }

    public void setUserDtoFrom(UserDto userDtoFrom) {
        this.userDtoFrom = userDtoFrom;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public List<UserDto> getReceivers() {
        return receivers;
    }

    public void setReceivers(List<UserDto> receivers) {
        this.receivers = receivers;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}