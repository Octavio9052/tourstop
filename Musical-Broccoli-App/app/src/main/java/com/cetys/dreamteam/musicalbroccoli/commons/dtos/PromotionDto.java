package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

import com.cetys.dreamteam.musicalbroccoli.commons.enums.PromotionType;

/**
 * Created by Octavio on 2016/10/24.
 */

public class PromotionDto {

    //<editor-fold defaultstate="collapsed" desc="Instance Properties">
    private int id;
    private float value;
    private String description;
    private PromotionType promotionType;
    private String promoCode;
    //</editor-fold>

    //<editor-fold defaultstate="collaped" desc="Property Accessors">
    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public float getValue() {
        return value;
    }

    public void setValue( float value ) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription( String description ) {
        this.description = description;
    }

    public PromotionType getPromotionType() {
        return promotionType;
    }

    public void setPromotionType( PromotionType promotionType ) {
        this.promotionType = promotionType;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode( String promoCode ) {
        this.promoCode = promoCode;
    }
    //</editor-fold>

}