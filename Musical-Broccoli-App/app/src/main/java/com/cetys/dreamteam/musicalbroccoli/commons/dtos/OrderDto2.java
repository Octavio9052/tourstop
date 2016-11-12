package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

import com.cetys.dreamteam.musicalbroccoli.commons.enums.PaymentType;

import java.util.Date;
import java.util.List;

/**
 * Created by Octavio on 2016/11/12.
 */

public class OrderDto2 {
    private int id;
    private Date dateCreated;
    private float totalAmount;
    private PaymentType paymentType;
    private boolean paymentStatus;
    private int userId;
    private int paymentInfoId;

    private List<ReservationDto2> reservations;
    private List<MovementDto2> movements;

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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPaymentInfoId() {
        return paymentInfoId;
    }

    public void setPaymentInfoId(int paymentInfoId) {
        this.paymentInfoId = paymentInfoId;
    }

    public List<ReservationDto2> getReservations() {
        return reservations;
    }

    public void setReservations(List<ReservationDto2> reservations) {
        this.reservations = reservations;
    }

    public List<MovementDto2> getMovements() {
        return movements;
    }

    public void setMovements(List<MovementDto2> movements) {
        this.movements = movements;
    }
}
