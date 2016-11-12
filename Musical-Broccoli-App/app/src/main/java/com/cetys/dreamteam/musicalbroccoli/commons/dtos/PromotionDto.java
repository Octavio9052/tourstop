package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

import com.cetys.dreamteam.musicalbroccoli.commons.enums.PromotionType;

/**
 * Created by Octavio on 2016/10/24.
 */

public class PromotionDto {

    private int id;
    private float value;
    private String decription;
    private PromotionType promotionType;
    private String promoCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
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