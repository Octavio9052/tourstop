package com.cetys.dreamteam.musicalbroccoli.commons.enums;

import com.cetys.dreamteam.musicalbroccoli.R;

/**
 * Created by Octavio on 2016/10/24.
 */

public enum PromotionType implements DescriptionEnum {
    PERCENTAGE(R.string.description_enum_promo_percentage),
    AMOUNT(R.string.description_enum_promo_amount);

    private final int description;

    PromotionType(int description) {
        this.description = description;
    }

    @Override
    public int getDescription() {
        return description;
    }
}