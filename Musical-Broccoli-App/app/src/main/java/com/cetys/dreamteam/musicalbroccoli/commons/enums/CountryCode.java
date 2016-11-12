package com.cetys.dreamteam.musicalbroccoli.commons.enums;

import com.cetys.dreamteam.musicalbroccoli.R;

/**
 * Created by Octavio on 2016/10/24.
 */

public enum CountryCode implements DescriptionEnum {
    MEX(R.string.description_enum_country_mexico),
    USA(R.string.description_enum_country_usa),
    CAN(R.string.description_enum_country_canada);

    private final int description;

    CountryCode(int description) {
        this.description = description;
    }

    @Override
    public int getDescription() {
        return description;
    }
}