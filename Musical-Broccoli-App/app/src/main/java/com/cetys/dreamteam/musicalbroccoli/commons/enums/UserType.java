package com.cetys.dreamteam.musicalbroccoli.commons.enums;

import com.cetys.dreamteam.musicalbroccoli.R;

/**
 * Created by Octavio on 2016/10/24.
 */

public enum UserType implements DescriptionEnum {
    TOUR_CUSTOMER(R.string.description_enum_user_customer),
    TOUR_ADMINISTRATOR(R.string.description_enum_user_administrator);

    private final int description;

    UserType(int description) {
        this.description = description;
    }

    @Override
    public int getDescription() {
        return description;
    }
}