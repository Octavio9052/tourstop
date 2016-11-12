package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

import com.cetys.dreamteam.musicalbroccoli.commons.enums.CountryCode;

/**
 * Created by Octavio on 2016/10/24.
 */

public class AddressDto {
    private int id;
    private String name;
    private String street_1;
    private String street_2;
    private String city;
    private String state;
    private String postalCode;
    private CountryCode CountryCode;

    public AddressDto(int id, String name, String street_1, String street_2, String city, String state, String postalCode, CountryCode CountryCode) {
        this.id = id;
        this.name = name;
        this.street_1 = street_1;
        this.street_2 = street_2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.CountryCode = CountryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStreet_1(String street_1) {
        this.street_1 = street_1;
    }

    public void setStreet_2(String street_2) {
        this.street_2 = street_2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCountryCode(CountryCode CountryCode) {
        this.CountryCode = CountryCode;
    }

    public int getId() {
        return id;
    }

    public String getStreet_1() {
        return street_1;
    }

    public String getStreet_2() {
        return street_2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode;
    }

}
