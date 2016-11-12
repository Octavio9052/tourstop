package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

import com.cetys.dreamteam.musicalbroccoli.commons.enums.PromotionType;

/**
 * Created by Octavio on 2016/10/24.
 */

public class PromotionDTO {

    private int id;
    private String description;
    private int value;          // it may not be intenger? (50%)
    private String PromoCode;
    private PromotionType PromotionType;

    public PromotionDTO(int id, String description, int value, String promoCode, com.cetys.dreamteam.musicalbroccoli.commons.enums.PromotionType promotionType) {
        this.id = id;
        this.description = description;
        this.value = value;
        PromoCode = promoCode;
        PromotionType = promotionType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getPromoCode() {
        return PromoCode;
    }

    public void setPromoCode(String promoCode) {
        PromoCode = promoCode;
    }

    public com.cetys.dreamteam.musicalbroccoli.commons.enums.PromotionType getPromotionType() {
        return PromotionType;
    }

    public void setPromotionType(com.cetys.dreamteam.musicalbroccoli.commons.enums.PromotionType promotionType) {
        PromotionType = promotionType;
    }
}