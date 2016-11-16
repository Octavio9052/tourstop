package com.cetys.dreamteam.musicalbroccoli.commons.enums;

import com.cetys.dreamteam.musicalbroccoli.R;

/**
 * Created by Octavio on 2016/11/12.
 */

public enum MovementType implements DescriptionEnum {
    SUBMITTED(R.string.description_enum_movement_type_submitted),
    SUBTRACTION(R.string.description_enum_movement_type_subtraction),
    CANCELLATION(R.string.description_enum_movement_type_cancellation);

    private final int description;

    MovementType(int description) {
        this.description = description;
    }

    @Override
    public int getDescription() {
        return description;
    }
}
