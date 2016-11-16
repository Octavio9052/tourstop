package com.cetys.dreamteam.musicalbroccoli.presentation.models;

import android.databinding.ObservableFloat;
import android.databinding.ObservableInt;

import com.cetys.dreamteam.musicalbroccoli.commons.enums.PromotionType;

/**
 * Created by Octavio on 2016/11/12.
 */

public class PromotionModel extends BaseModel {
    private ObservableInt id;
    private ObservableFloat value;
    private String description;
    private PromotionType promotionType;
    private String promoCode;

    public ObservableInt getId() {
        return id;
    }

    public void setId(ObservableInt id) {
        this.id = id;
    }

    public ObservableFloat getValue() {
        return value;
    }

    public void setValue(ObservableFloat value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PromotionType getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(PromotionType promotionType) {
        this.promotionType = promotionType;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }
}
