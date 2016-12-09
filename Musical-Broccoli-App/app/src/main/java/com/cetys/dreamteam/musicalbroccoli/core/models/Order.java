package com.cetys.dreamteam.musicalbroccoli.core.models;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableFloat;
import android.databinding.ObservableInt;

import com.cetys.dreamteam.musicalbroccoli.core.enums.PaymentType;

import java.util.Date;

/**
 * Created by Octavio on 2016/11/12.
 */

public class Order extends BaseModel {

    //<editor-fold defaultstate="collapsed" desc="Instance Properties">
    private ObservableInt id;
    private Date dateCreated;
    private ObservableFloat floatAmount;
    private PaymentType paymentType;
    private ObservableBoolean paymentStatus;
    private ObservableInt userId;
    private ObservableInt paymentInfoId;

    private ObservableArrayList<Reservation> reservations;
    private ObservableArrayList<Movement> movements;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Property Accessors">
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        if (this.id == null)
            this.id = new ObservableInt(id);
        else
            this.id.set(id);
    }

    public float getFloatAmount() {
        return floatAmount.get();
    }

    public void setFloatAmount(float floatAmount) {
        if (this.floatAmount == null)
            this.floatAmount = new ObservableFloat(floatAmount);
        else
            this.floatAmount.set(floatAmount);
    }

    public boolean getPaymentStatus() {
        return paymentStatus.get();
    }

    public void setPaymentStatus(boolean paymentStatus) {
        if (this.paymentStatus == null)
            this.paymentStatus = new ObservableBoolean(paymentStatus);
        else
            this.paymentStatus.set(paymentStatus);
    }

    public int getUserId() {
        return userId.get();
    }

    public void setUserId(int userId) {
        if (this.userId == null)
            this.userId = new ObservableInt(userId);
        else
            this.userId.set(userId);
    }

    public int getPaymentInfoId() {
        return paymentInfoId.get();
    }

    public void setPaymentInfoId(int paymentInfoId) {
        if (this.paymentInfoId == null)
            this.paymentInfoId = new ObservableInt(paymentInfoId);
        else
            this.paymentInfoId.set(paymentInfoId);
    }

    //

    public ObservableArrayList<Movement> getMovements() {
        return movements;
    }

    public void setMovements(ObservableArrayList<Movement> movements) {
        this.movements = movements;
    }

    public ObservableArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(ObservableArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }
    //</editor-fold>

}
