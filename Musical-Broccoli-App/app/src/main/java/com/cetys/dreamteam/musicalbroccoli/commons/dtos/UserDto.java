package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

import com.cetys.dreamteam.musicalbroccoli.commons.enums.LanguageCode;
import com.cetys.dreamteam.musicalbroccoli.commons.enums.UserType;

import java.util.List;

/**
 * Created by Octavio on 2016/10/24.
 */

public class UserDto extends BaseDto {

    //<editor-fold defaultstate="collapsed" desc="Instance Properties">
    private int id;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private LanguageCode languageCode;
    private UserType userType;
    private int addressId;

    private List< MessageDto > messages;
    private List< TourDto > tours;
    private List< OrderDto > orders;
    private List< RatingDto > ratings;
    private List< ReservationDto > reservations;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Property Accessors">
    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone( String phone ) {
        this.phone = phone;
    }

    public LanguageCode getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode( LanguageCode languageCode ) {
        this.languageCode = languageCode;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType( UserType userType ) {
        this.userType = userType;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId( int addressId ) {
        this.addressId = addressId;
    }

    public List< MessageDto > getMessages() {
        return messages;
    }

    public void setMessages( List< MessageDto > messages ) {
        this.messages = messages;
    }

    public List< TourDto > getTours() {
        return tours;
    }

    public void setTours( List< TourDto > tours ) {
        this.tours = tours;
    }

    public List< OrderDto > getOrders() {
        return orders;
    }

    public void setOrders( List< OrderDto > orders ) {
        this.orders = orders;
    }

    public List< RatingDto > getRatings() {
        return ratings;
    }

    public void setRatings( List< RatingDto > ratings ) {
        this.ratings = ratings;
    }

    public List< ReservationDto > getReservations() {
        return reservations;
    }

    public void setReservations( List< ReservationDto > reservations ) {
        this.reservations = reservations;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword( String password ) {
        this.password = password;
    }
    //</editor-fold>

}