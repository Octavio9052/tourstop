package com.cetys.dreamteam.musicalbroccoli.presentation.models;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by Octavio on 2016/11/12.
 */

public class PaymentInfoModel extends BaseModel {

    //<editor-fold defaultstate="collapsed" desc="Instance Properties">
    private ObservableInt id;
    private ObservableField<String> cardNumber;
    private ObservableInt typeOfCard; // TODO: temp. May change in the very near future
    private ObservableField<String> cardHolderName;
    private ObservableInt expirationDate; // TODO: ExpirationDate should be Date (datatype)
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Property Accessors">
    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        if (this.id == null)
            this.id = new ObservableInt(id);
        else
            this.id.set(id);
    }

    public String getCardNumber() {
        return cardNumber.get();
    }

    public void setCardNumber(String cardNumber) {
        if (this.cardNumber == null)
            this.cardNumber = new ObservableField<>(cardNumber);
        else
            this.cardNumber.set(cardNumber);
    }

    public int getTypeOfCard() {
        return typeOfCard.get();
    }

    public void setTypeOfCard(int typeOfCard) {
        if (this.typeOfCard == null)
            this.typeOfCard = new ObservableInt(typeOfCard);
        else
            this.typeOfCard.set(typeOfCard);

    }

    public String getCardHolderName() {
        return cardHolderName.get();
    }

    public void setCardHolderName(String cardHolderName) {
        if (this.cardHolderName == null)
            this.cardHolderName = new ObservableField<>(cardHolderName);
        else
            this.cardHolderName.set(cardHolderName);
    }

    public int getExpirationDate() {
        return expirationDate.get();
    }

    public void setExpirationDate(int expirationDate) {
        if (this.expirationDate == null)
            this.expirationDate = new ObservableInt(expirationDate);
        else
            this.expirationDate.set(expirationDate);
    }
    //</editor-fold>

}
