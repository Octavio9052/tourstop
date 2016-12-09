package com.cetys.dreamteam.musicalbroccoli.core.enums;

import com.cetys.dreamteam.musicalbroccoli.R;

/**
 * Created by Octavio on 2016/10/24.
 */

public enum LanguageCode implements DescriptionEnum {
    ES(R.string.description_enum_language_spanish),
    EN(R.string.description_enum_language_english);

    private final int description;

    LanguageCode(int description) {
        this.description = description;
    }

    @Override
    public int getDescription() {
        return description;
    }
}