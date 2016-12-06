package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.commons.enums.CountryCode;
import com.cetys.dreamteam.musicalbroccoli.networking.services.UserService;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.UserModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.CreateUserViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.MainPageActivity;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Octavio on 2016/12/04.
 */

public class CreateUserViewModelImpl extends BaseModelViewModelImpl<UserModel> implements CreateUserViewModel {

    //<editor-fold desc="Instance Properties" defaulstate="collapsed">
    private boolean isPromoter;
    private boolean isUser;
    private List<CountryCode> countryCodes;
    //</editor-fold>

    public CreateUserViewModelImpl(Context context, UserService baseService) {
        super(context, baseService);

        load();
    }

    @Override
    protected void load() {
        countryCodes = Arrays.asList(CountryCode.values());
    }

    //<editor-fold desc="Property Accessors" defaultstate="collapse">
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
        create();
        Intent intent = new Intent(context, MainPageActivity.class);
        context.startActivity(intent);
    }
    //</editor-fold>

    @Override
    public void onRadioButtonClick(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.type_promoter:
                changeState(checked, !checked);
                break;
            case R.id.type_user:
                changeState(!checked, checked);
                break;
        }
    }

    private void changeState(boolean isPromoter, boolean isUser) {
        this.isPromoter = isPromoter;
        this.isUser = isUser;
    }

    private void doTemporalToast() {
        Toast.makeText(context, "New user created", Toast.LENGTH_LONG).show();
    }

}
