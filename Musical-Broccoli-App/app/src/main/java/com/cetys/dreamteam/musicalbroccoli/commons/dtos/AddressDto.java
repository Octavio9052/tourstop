package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

import com.cetys.dreamteam.musicalbroccoli.commons.enums.CountryCode;

/**
 * Created by Octavio on 2016/10/24.
 */

public class AddressDto {

    //<editor-fold defaultstate="collapsed" desc="Instance Properties">
    private int id;
    private String name;
    private String street1;
    private String street2;
    private String city;
    private String state;
    private int postalCode;
    private CountryCode countryCode;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Property Accessors">
    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1( String street1 ) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2( String street2 ) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity( String city ) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState( String state ) {
        this.state = state;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode( int postalCode ) {
        this.postalCode = postalCode;
    }

    public CountryCode getCountryCode() {
        return countryCode;
    }

    public void setCountryCode( CountryCode countryCode ) {
        this.countryCode = countryCode;
    }
    //</editor-fold>

}
