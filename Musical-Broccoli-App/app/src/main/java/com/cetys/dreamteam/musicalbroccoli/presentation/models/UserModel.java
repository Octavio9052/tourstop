package com.cetys.dreamteam.musicalbroccoli.presentation.models;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableInt;

import com.cetys.dreamteam.musicalbroccoli.commons.enums.LanguageCode;
import com.cetys.dreamteam.musicalbroccoli.commons.enums.UserType;

/**
 * Created by Octavio on 2016/11/12.
 */

public class UserModel extends BaseModel {
    private ObservableInt id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private LanguageCode languageCode;
    private UserType userType;
    private ObservableInt addressId;

    private ObservableArrayList<MessageModel> messages;
    private ObservableArrayList<TourModel> tours;
    private ObservableArrayList<OrderModel> orders;
    private ObservableArrayList<RatingModel> ratings;
    private ObservableArrayList<ReservationModel> reservations;

    public ObservableInt getId() {
        return id;
    }

    public void setId(ObservableInt id) {
        this.id = id;
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

    public LanguageCode getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public ObservableInt getAddressId() {
        return addressId;
    }

    public void setAddressId(ObservableInt addressId) {
        this.addressId = addressId;
    }

    public ObservableArrayList<MessageModel> getMessages() {
        return messages;
    }

    public void setMessages(ObservableArrayList<MessageModel> messages) {
        this.messages = messages;
    }

    public ObservableArrayList<TourModel> getTours() {
        return tours;
    }

    public void setTours(ObservableArrayList<TourModel> tours) {
        this.tours = tours;
    }

    public ObservableArrayList<OrderModel> getOrders() {
        return orders;
    }

    public void setOrders(ObservableArrayList<OrderModel> orders) {
        this.orders = orders;
    }

    public ObservableArrayList<RatingModel> getRatings() {
        return ratings;
    }

    public void setRatings(ObservableArrayList<RatingModel> ratings) {
        this.ratings = ratings;
    }

    public ObservableArrayList<ReservationModel> getReservations() {
        return reservations;
    }

    public void setReservations(ObservableArrayList<ReservationModel> reservations) {
        this.reservations = reservations;
    }
}
