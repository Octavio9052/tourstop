package com.cetys.dreamteam.musicalbroccoli.core.enums;

import com.cetys.dreamteam.musicalbroccoli.R;

/**
 * Created by Octavio on 2016/11/11.
 */

public enum PaymentType implements DescriptionEnum {
    CREDIT(R.string.description_enum_payment_type_credit),
    CASH(R.string.description_enum_payment_type_cash);

    private final int description;

    PaymentType(int description) {
        this.description = description;
    }

    @Override
    public int getDescription() {
        return description;
    }
}
