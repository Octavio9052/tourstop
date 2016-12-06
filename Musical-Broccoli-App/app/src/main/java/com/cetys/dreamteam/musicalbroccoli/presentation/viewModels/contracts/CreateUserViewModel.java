package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts;

import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.commons.enums.CountryCode;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.UserModel;

import java.util.List;

/**
 * Created by Octavio on 2016/12/04.
 */

public interface CreateUserViewModel extends BaseModelViewModel<UserModel> {

    List<CountryCode> getCountryCodes();

    CreateUserViewModel setCountryCodes(List<CountryCode> countryCodes);

    void onSaveChangesClick(View view);

    void onRadioButtonClick(View view);
}
