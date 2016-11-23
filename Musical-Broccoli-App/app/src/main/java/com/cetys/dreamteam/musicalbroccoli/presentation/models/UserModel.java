package com.cetys.dreamteam.musicalbroccoli.presentation.models;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

import com.cetys.dreamteam.musicalbroccoli.commons.enums.LanguageCode;
import com.cetys.dreamteam.musicalbroccoli.commons.enums.UserType;

/**
 * Created by Octavio on 2016/11/12.
 */

public class UserModel extends BaseModel {
    private ObservableInt id;
    private ObservableField<String> password;
    private ObservableField<String> firstName;
    private ObservableField<String> lastName;
    private ObservableField<String> email;
    private ObservableField<String> phone;
    private LanguageCode languageCode;
    private UserType userType;
    private ObservableInt addressId;

    private ObservableArrayList<MessageModel> messages;
    private ObservableArrayList<TourModel> tours;
    private ObservableArrayList<OrderModel> orders;
    private ObservableArrayList<RatingModel> ratings;
    private ObservableArrayList<ReservationModel> reservations;

    public int getId(){
        return id.get();
    }

    public void setId(int id){
        if(this.id == null)
            this.id = new ObservableInt(id);
        else
            this.id.set(id);
    }

    public String getPassword(){
        return password.get();
    }

    public void setPassword(String password){
        if(this.password == null)
            this.password = new ObservableField<>(password);
        else
            this.password.set(password);
    }

    public String getFirstName(){
        return firstName.get();
    }

    public void setFirstName(String firstName){
        if(this.firstName == null)
            this.firstName = new ObservableField<>(firstName);
        else
            this.firstName.set(firstName);
    }

    public String getLastName(){
        return lastName.get();
    }

    public void setLastName(String lastName){
        if(this.lastName == null)
            this.lastName = new ObservableField<>(lastName);
        else
            this.lastName.set(lastName);
    }

    public String getEmail(){
        return email.get();
    }

    public void setEmail(String email){
        if(this.email == null)
            this.email = new ObservableField<>(email);
        else
            this.email.set(email);
    }

    public String getPhone(){
        return phone.get();
    }

    public void setPhone(String phone){
        if(this.phone == null)
            this.phone = new ObservableField<>(phone);
        else
            this.phone.set(phone);
    }

    public int getAddressId(){
        return addressId.get();
    }

    public void setAddressId(int addressId){
        if(this.addressId == null)
            this.addressId = new ObservableInt(addressId);
        else
            this.addressId.set(addressId);
    }

    //

    public ObservableArrayList<ReservationModel> getReservations() {
        return reservations;
    }

    public void setReservations(ObservableArrayList<ReservationModel> reservations) {
        this.reservations = reservations;
    }

    public ObservableArrayList<RatingModel> getRatings() {
        return ratings;
    }

    public void setRatings(ObservableArrayList<RatingModel> ratings) {
        this.ratings = ratings;
    }

    public ObservableArrayList<OrderModel> getOrders() {
        return orders;
    }

    public void setOrders(ObservableArrayList<OrderModel> orders) {
        this.orders = orders;
    }

    public ObservableArrayList<TourModel> getTours() {
        return tours;
    }

    public void setTours(ObservableArrayList<TourModel> tours) {
        this.tours = tours;
    }

    public ObservableArrayList<MessageModel> getMessages() {
        return messages;
    }

    public void setMessages(ObservableArrayList<MessageModel> messages) {
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
}
