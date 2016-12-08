package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.RadioButton;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.commons.enums.CountryCode;
import com.cetys.dreamteam.musicalbroccoli.commons.enums.UserType;
import com.cetys.dreamteam.musicalbroccoli.presentation.connectors.UserConnector;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.User;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.CreateUserViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.MainPageActivity;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Octavio on 2016/12/04.
 */

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
