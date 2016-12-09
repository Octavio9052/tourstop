package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.view.View;
import android.widget.RadioButton;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.business.connectors.contracts.UserConnector;
import com.cetys.dreamteam.musicalbroccoli.core.enums.CountryCode;
import com.cetys.dreamteam.musicalbroccoli.core.enums.UserType;
import com.cetys.dreamteam.musicalbroccoli.core.models.User;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.CreateUserViewModel;
import com.wesleyelliott.kubwa.annotation.Email;
import com.wesleyelliott.kubwa.annotation.NotNull;
import com.wesleyelliott.kubwa.annotation.Password;
import com.wesleyelliott.kubwa.rule.PasswordRule;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Octavio on 2016/12/04.
 */
@Email(errorMessage = R.string.error_invalid_email)
@Password(errorMessage = R.string.error_invalid_password, scheme = PasswordRule.Scheme.ALPHA_NUMERIC)
@NotNull.List({
        @NotNull(errorMessage = R.string.error_field_required, name = "firstNameError"),
        @NotNull(errorMessage = R.string.error_field_required, name = "streetOneError"),
        @NotNull(errorMessage = R.string.error_field_required, name = "cityError"),
        @NotNull(errorMessage = R.string.error_field_required, name = "stateError"),
        @NotNull(errorMessage = R.string.error_field_required, name = "cityError"),
        @NotNull(errorMessage = R.string.error_field_required, name = "addressNameError"),
        @NotNull(errorMessage = R.string.error_field_required, name = "postalCodeError"),
        @NotNull(errorMessage = R.string.error_field_required, name = "countryCodeError"),

})
public class CreateUserViewModelImpl extends BaseViewModel implements CreateUserViewModel {

    //<editor-fold desc="Instance Properties" defaulstate="collapsed">
    private final UserConnector connector;
    private User user;
    private List<CountryCode> countryCodes;
    //</editor-fold>

    public CreateUserViewModelImpl(Context context, UserConnector connector) {
        super(context);
        this.connector = connector;
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
        connector.create(user);
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
