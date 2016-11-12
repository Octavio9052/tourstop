package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

import java.util.Date;

/**
 * Created by Octavio on 2016/11/12.
 */

public class PaymentInfoDto {
    private int id;
    private String cardNumber;
    private int type_of_card; // temp. May change in the very near future
    private String cardHolder_name;
    private Date expiration_date;
    private UserDto user_id;

    public PaymentInfoDto(int id, String cardNumber, String cardHolder_name, int type_of_card, Date expiration_date, UserDto user_id) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.cardHolder_name = cardHolder_name;
        this.type_of_card = type_of_card;
        this.expiration_date = expiration_date;
        this.user_id = user_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getType_of_card() {
        return type_of_card;
    }

    public void setType_of_card(int type_of_card) {
        this.type_of_card = type_of_card;
    }

    public String getCardHolder_name() {
        return cardHolder_name;
    }

    public void setCardHolder_name(String cardHolder_name) {
        this.cardHolder_name = cardHolder_name;
    }

    public Date getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(Date expiration_date) {
        this.expiration_date = expiration_date;
    }

    public UserDto getUser_id() {
        return user_id;
    }

    public void setUser_id(UserDto user_id) {
        this.user_id = user_id;
    }
}
