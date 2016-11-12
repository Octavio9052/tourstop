package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

import com.cetys.dreamteam.musicalbroccoli.commons.enums.UserType;
import com.cetys.dreamteam.musicalbroccoli.commons.enums.LanguageCode;

/**
 * Created by Octavio on 2016/10/24.
 */

public class UserDTO {

    private int id;
    private String FirstName;
    private String LastName;
    private AddressDTO AddressDTO;
    private String Phone;
    private UserType UserType;
    private LanguageCode LanguageCode;

    public UserDTO(int id, String FirstName, String LastName, AddressDTO AddressDTO, String Phone, UserType UserType, LanguageCode LanguageCode) {
        this.id = id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.AddressDTO = AddressDTO;
        this.Phone = Phone;
        this.UserType = UserType;
        this.LanguageCode = LanguageCode;
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

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public AddressDTO getAddressDTO() {
        return AddressDTO;
    }

    public void setAddressDTO(AddressDTO AddressDTO) {
        this.AddressDTO = AddressDTO;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public UserType getUserType() {
        return UserType;
    }

    public void setUserType(UserType UserType) {
        this.UserType = UserType;
    }

    public LanguageCode getLanguageCode() {
        return LanguageCode;
    }

    public void setLanguageCode(LanguageCode LanguageCode) {
        this.LanguageCode = LanguageCode;
    }


}