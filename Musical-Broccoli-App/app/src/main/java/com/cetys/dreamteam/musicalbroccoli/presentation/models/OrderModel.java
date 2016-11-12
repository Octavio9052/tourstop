package com.cetys.dreamteam.musicalbroccoli.presentation.models;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableFloat;
import android.databinding.ObservableInt;

import com.cetys.dreamteam.musicalbroccoli.commons.enums.PaymentType;

import java.util.Date;

/**
 * Created by Octavio on 2016/11/12.
 */

public class OrderModel extends BaseModel {
    private ObservableInt id;
    private Date dateCreated;
    private ObservableFloat floatAmount;
    private PaymentType paymentType;
    private ObservableBoolean paymentStatus;
    private ObservableInt userId;
    private ObservableInt paymentInfoId;

    private ObservableArrayList<ReservationModel> reservations;
    private ObservableArrayList<MovementModel> movements;

    public ObservableInt getId() {
        return id;
    }

    public void setId(ObservableInt id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public ObservableFloat getFloatAmount() {
        return floatAmount;
    }

    public void setFloatAmount(ObservableFloat floatAmount) {
        this.floatAmount = floatAmount;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public ObservableBoolean getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(ObservableBoolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public ObservableInt getUserId() {
        return userId;
    }

    public void setUserId(ObservableInt userId) {
        this.userId = userId;
    }

    public ObservableInt getPaymentInfoId() {
        return paymentInfoId;
    }

    public void setPaymentInfoId(ObservableInt paymentInfoId) {
        this.paymentInfoId = paymentInfoId;
    }

    public ObservableArrayList<ReservationModel> getReservations() {
        return reservations;
    }

    public void setReservations(ObservableArrayList<ReservationModel> reservations) {
        this.reservations = reservations;
    }

    public ObservableArrayList<MovementModel> getMovements() {
        return movements;
    }

    public void setMovements(ObservableArrayList<MovementModel> movements) {
        this.movements = movements;
    }
}
