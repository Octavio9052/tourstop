package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

import com.cetys.dreamteam.musicalbroccoli.commons.enums.UserType;
import com.cetys.dreamteam.musicalbroccoli.commons.enums.LanguageCode;

/**
 * Created by Octavio on 2016/10/24.
 */

public class UserDto {

    private int id;
    private String FirstName;
    private String LastName;
    private AddressDto AddressDto;
    private String Phone;
    private UserType UserType;
    private LanguageCode LanguageCode;
    private String email;

    public UserDto(int id, String firstName, String lastName, AddressDto addressDto, String phone, UserType userType, LanguageCode languageCode, String email) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        AddressDto = addressDto;
        Phone = phone;
        UserType = userType;
        LanguageCode = languageCode;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public AddressDto getAddressDto() {
        return AddressDto;
    }

    public void setAddressDto(AddressDto addressDto) {
        AddressDto = addressDto;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public UserType getUserType() {
        return UserType;
    }

    public void setUserType(UserType userType) {
        UserType = userType;
    }

    public LanguageCode getLanguageCode() {
        return LanguageCode;
    }

    public void setLanguageCode(LanguageCode languageCode) {
        LanguageCode = languageCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}