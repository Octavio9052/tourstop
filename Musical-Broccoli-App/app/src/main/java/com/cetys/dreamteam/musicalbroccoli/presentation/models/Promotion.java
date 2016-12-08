package com.cetys.dreamteam.musicalbroccoli.presentation.models;

import android.databinding.ObservableField;
import android.databinding.ObservableFloat;
import android.databinding.ObservableInt;

import com.cetys.dreamteam.musicalbroccoli.commons.enums.PromotionType;

/**
 * Created by Octavio on 2016/11/12.
 */
public class Promotion extends BaseModel {

    //<editor-fold defaultstate="collapsed" desc="Instance Properties">
    private ObservableInt id;
    private ObservableFloat value;
    private ObservableField<String> description;
    private PromotionType promotionType;
    private ObservableField<String> promoCode;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Property Accessors">
    public PromotionType getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(PromotionType promotionType) {
        this.promotionType = promotionType;
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

    public float getValue() {
        return value.get();
    }

    public void setValue(float value) {
        if (this.value == null)
            this.value = new ObservableFloat(value);
        else
            this.value.set(value);
    }

    public String getDescription() {
        return description.get();
    }

    public void setDescription(String description) {
        if (this.description == null)
            this.description = new ObservableField<>(description);
        else
            this.description.set(description);
    }

    public String getPromoCode() {
        return promoCode.get();
    }

    public void setPromoCode(String promoCode) {
        if (this.promoCode == null)
            this.promoCode = new ObservableField<>(promoCode);
        else
            this.promoCode.set(promoCode);
    }
    //</editor-fold>

}
