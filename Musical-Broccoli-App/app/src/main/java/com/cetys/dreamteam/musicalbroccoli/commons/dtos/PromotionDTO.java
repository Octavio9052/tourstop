package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

import com.cetys.dreamteam.musicalbroccoli.commons.enums.PromotionType;

/**
 * Created by Octavio on 2016/10/24.
 */

public class PromotionDto {

    private int id;
    private String description;
    private int value;          // it may not be intenger? (50%)
    private String PromoCode;
    private PromotionType PromotionType;
    private TourDto tour_id;

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

    public PromotionType getPromotionType() {
        return PromotionType;
    }

    public void setPromotionType(PromotionType promotionType) {
        PromotionType = promotionType;
    }

    public TourDto getTour_id() {
        return tour_id;
    }

    public void setTour_id(TourDto tour_id) {
        this.tour_id = tour_id;
    }

    public PromotionDto(int id, String description, int value, String promoCode, PromotionType promotionType, TourDto tour_id) {

        this.id = id;
        this.description = description;
        this.value = value;
        PromoCode = promoCode;
        PromotionType = promotionType;
        this.tour_id = tour_id;
    }
}