package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.business.connectors.contracts.UserConnector;
import com.cetys.dreamteam.musicalbroccoli.core.models.User;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.ChangePasswordViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.UserProfileActivity;
import com.wesleyelliott.kubwa.annotation.ConfirmPassword;
import com.wesleyelliott.kubwa.annotation.Password;

/**
 * Created by Octavio on 2016/11/20.
 */
@Password(errorMessage = R.string.error_invalid_password)
@ConfirmPassword(errorMessage = R.string.error_invalid_password)
public class ChangePasswordViewModelImpl extends BaseViewModel implements ChangePasswordViewModel {

    //<editor-fold desc="Instance Properties" defaultstate="collapsed">
    private final ChangePasswordViewModelImplValidator validator;
    private final UserConnector connector;
    private User user;
    private String confirmationPassword;
    //</editor-fold>

    public ChangePasswordViewModelImpl(Context context, UserConnector connector, ChangePasswordViewModelImplValidator validator) {
        super(context);
        this.connector = connector;
        this.validator = validator;

        load();
    }

    //<editor-fold desc="Property Accessors" defaultstate="collapsed">
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    //</editor-fold>

    //<editor-fold desc="On-Click Listeners" defaultstate="collapsed">
    @Override
    public void onSaveChangesClick(View view) {
        validator.validatePassword(user.getPassword());
        validator.validateConfirmPassword(user.getPassword(), getConfirmPassword());
        // TODO: Always FALSE doesn't open new activity. (p)
        if(validator.isValid())
            connector.update(user);
        else
            Toast.makeText(context, R.string.toast_error_input, Toast.LENGTH_LONG).show();
        /* Intent intent = new Intent(context, UserProfileActivity.class);
        context.startActivity(intent);*/
    }
    //</editor-fold>

    @Override
    protected void load() {
        user = new User();
    }

    //TODO: Bindear confirmpassword al edittext (p)
    @Override
    public void setConfirmPassword(String confirmPassword) {
        this.confirmationPassword = confirmPassword;
    }

    @Override
    public String getConfirmPassword() {
        return this.confirmationPassword;
    }
}
