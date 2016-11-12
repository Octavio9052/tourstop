package com.cetys.dreamteam.musicalbroccoli.presentation.models;

import android.databinding.ObservableInt;

/**
 * Created by Octavio on 2016/11/12.
 */

public class PaymentInfoModel extends BaseModel {
    private ObservableInt id;
    private String cardNumber;
    private ObservableInt typeOfCard; // TODO: temp. May change in the very near future
    private String cardHolderName;
    private ObservableInt expirationDate; // TODO: ExpirationDate should be Date (datatype)

    public ObservableInt getId() {
        return id;
    }

    public void setId(ObservableInt id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public ObservableInt getTypeOfCard() {
        return typeOfCard;
    }

    public void setTypeOfCard(ObservableInt typeOfCard) {
        this.typeOfCard = typeOfCard;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public ObservableInt getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(ObservableInt expirationDate) {
        this.expirationDate = expirationDate;
    }
}
