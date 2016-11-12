package com.cetys.dreamteam.musicalbroccoli.presentation.models;

import android.databinding.ObservableInt;

import com.cetys.dreamteam.musicalbroccoli.commons.enums.CountryCode;

/**
 * Created by Octavio on 2016/11/12.
 */

public class AddressModel extends BaseModel {
    private ObservableInt id;
    private String name;
    private String street1;
    private String street2;
    private String city;
    private String state;
    private ObservableInt postalCode;
    private CountryCode countryCode;

    public ObservableInt getId() {
        return id;
    }

    public void setId(ObservableInt id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ObservableInt getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(ObservableInt postalCode) {
        this.postalCode = postalCode;
    }

    public CountryCode getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode;
    }
}
