package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

import com.cetys.dreamteam.musicalbroccoli.commons.enums.PaymentType;

import java.util.Date;

/**
 * Created by Octavio on 2016/11/12.
 */

public class OrderDto {
    private int id;
    private Date dateCreated;
    private float totalAmount;
    private PaymentType paymentType;
    private boolean paymentStatus;
    private UserDto user_id;
    private PaymentInfoDto paymentInfo_id;

    public OrderDto(int id, Date dateCreated, float totalAmount, PaymentType paymentType, boolean paymentStatus, UserDto user_id, PaymentInfoDto paymentInfo_id) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.totalAmount = totalAmount;
        this.paymentType = paymentType;
        this.paymentStatus = paymentStatus;
        this.user_id = user_id;
        this.paymentInfo_id = paymentInfo_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public UserDto getUser_id() {
        return user_id;
    }

    public void setUser_id(UserDto user_id) {
        this.user_id = user_id;
    }

    public PaymentInfoDto getPaymentInfo_id() {
        return paymentInfo_id;
    }

    public void setPaymentInfo_id(PaymentInfoDto paymentInfo_id) {
        this.paymentInfo_id = paymentInfo_id;
    }
}
