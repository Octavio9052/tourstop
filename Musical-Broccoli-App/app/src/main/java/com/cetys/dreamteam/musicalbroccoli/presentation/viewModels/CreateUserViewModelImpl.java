package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.business.connectors.contracts.UserConnector;
import com.cetys.dreamteam.musicalbroccoli.core.enums.CountryCode;
import com.cetys.dreamteam.musicalbroccoli.core.enums.UserType;
import com.cetys.dreamteam.musicalbroccoli.core.models.User;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.CreateUserViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.MainPageActivity;
import com.wesleyelliott.kubwa.annotation.Email;
import com.wesleyelliott.kubwa.annotation.FullName;
import com.wesleyelliott.kubwa.annotation.NotNull;
import com.wesleyelliott.kubwa.annotation.Password;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Octavio on 2016/12/04.
 */

@FullName(errorMessage = R.string.error_field_required)
@Email(errorMessage = R.string.error_invalid_email)
@Password(errorMessage = R.string.error_invalid_password)
@NotNull(errorMessage = R.string.toast_error_input)
public class CreateUserViewModelImpl extends BaseViewModel implements CreateUserViewModel {

    //<editor-fold desc="Instance Properties" defaulstate="collapsed">
    private final CreateUserViewModelImplValidator validator;
    private final UserConnector connector;
    private User user;
    private List<CountryCode> countryCodes;
    //</editor-fold>

    public CreateUserViewModelImpl(Context context, UserConnector connector, CreateUserViewModelImplValidator validator) {
        super(context);
        this.connector = connector;
        this.validator = validator;

        load();
    }

    @Override
    protected void load() {
        countryCodes = Arrays.asList(CountryCode.values());
        user = new User();
    }

    //<editor-fold desc="Property Accessors" defaultstate="collapse">
    @Override
    public User getUser() {
        return this.user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public List<CountryCode> getCountryCodes() {
        return countryCodes;
    }

    @Override
    public CreateUserViewModel setCountryCodes(List<CountryCode> countryCodes) {
        return null;
    }
    //</editor-fold>

    //<editor-fold desc="On-Click Listeners" defaultstate="collapsed">
    @Override
    public void onSaveChangesClick(View view) {
        validator.validateEmail(user.getEmail());
        validator.validatePassword(user.getPassword());
        validator.validateFullName(user.getFirstName());
        validator.validateFullName(user.getLastName());
        validator.validateNotNull(user.getAddress().getCity());
        validator.validateNotNull(user.getAddress().getName());
        validator.validateNotNull(user.getAddress().getState());
        validator.validateNotNull(user.getAddress().getStreet1());
        validator.validateNotNull(user.getAddress().getStreet2());
        validator.validateNotNull(String.valueOf(user.getAddress().getPostalCode()));

        if(validator.isValid())
            connector.create(user);
        else
            Toast.makeText(context, R.string.toast_error_input, Toast.LENGTH_LONG).show();


        Intent intent = new Intent(context, MainPageActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onRadioButtonClick(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.type_promoter:
                getUser().setUserType(UserType.TOUR_ADMINISTRATOR);
                break;
            case R.id.type_user:
                getUser().setUserType(UserType.TOUR_CUSTOMER);
                break;
        }
    }
    //</editor-fold>


}
