package com.cetys.dreamteam.musicalbroccoli.core.models;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

import com.cetys.dreamteam.musicalbroccoli.core.enums.LanguageCode;
import com.cetys.dreamteam.musicalbroccoli.core.enums.UserType;

/**
 * Created by Octavio on 2016/11/12.
 */

public class User extends BaseModel {

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

    private Address address;
    private ObservableArrayList<Message> messages;
    private ObservableArrayList<Tour> tours;
    private ObservableArrayList<Order> orders;
    private ObservableArrayList<Rating> ratings;
    private ObservableArrayList<Reservation> reservations;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Property Accessors">
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
            this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
            this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
            this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
            this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
            this.phone = phone;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {

            this.addressId = addressId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ObservableArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(ObservableArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }

    public ObservableArrayList<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(ObservableArrayList<Rating> ratings) {
        this.ratings = ratings;
    }

    public ObservableArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ObservableArrayList<Order> orders) {
        this.orders = orders;
    }

    public ObservableArrayList<Tour> getTours() {
        return tours;
    }

    public void setTours(ObservableArrayList<Tour> tours) {
        this.tours = tours;
    }

    public ObservableArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ObservableArrayList<Message> messages) {
        this.messages = messages;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public LanguageCode getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode;
    }
    //</editor-fold>

}
