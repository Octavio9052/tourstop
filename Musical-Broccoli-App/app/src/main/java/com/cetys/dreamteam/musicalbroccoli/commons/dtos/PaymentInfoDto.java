package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

/**
 * Created by Octavio on 2016/11/12.
 */

public class PaymentInfoDto {

    //<editor-fold defaultstate="collapsed" desc="Instance Properties">
    private int id;
    private String cardNumber;
    private int typeOfCard; // TODO: temp. May change in the very near future
    private String cardHolderName;
    private int expirationDate; // TODO: ExpirationDate should be Date (datatype)
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Property Accessors".
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

    public int getTypeOfCard() {
        return typeOfCard;
    }

    public void setTypeOfCard(int typeOfCard) {
        this.typeOfCard = typeOfCard;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }
    //</editor-fold>

}
