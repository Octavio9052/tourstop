package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.databinding.Bindable;
import android.view.View;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.BR;
import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.business.connectors.contracts.UserConnector;
import com.cetys.dreamteam.musicalbroccoli.core.models.User;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.LoginViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.CreateUserActivity;
import com.wesleyelliott.kubwa.annotation.Email;
import com.wesleyelliott.kubwa.annotation.Password;
import com.wesleyelliott.kubwa.rule.PasswordRule;

/**
 * Created by Octavio on 2016/11/16.
 */

@Email(errorMessage = R.string.error_invalid_email)
@Password(errorMessage = R.string.error_invalid_password, scheme = PasswordRule.Scheme.ALPHA_NUMERIC_SYMBOLS)
public class LoginViewModelImpl extends BaseViewModel implements LoginViewModel {

    //<editor-fold desc="Instance Properties" defaultstate="collapsed">
    private final LoginViewModelImplValidator validator;
    private final UserConnector connector;
    private User user;
    //</editor-fold>

    public LoginViewModelImpl(Context context, UserConnector connector, LoginViewModelImplValidator validator) {
        super(context);
        this.connector = connector;
        this.validator = validator;

        load();
    }

    @Override
    protected void load() {
        user = new User();
    }

    //<editor-fold desc="Property Accessors" defaultstate="collapsed">
    @Override
    public User getUser() {
        return user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
    }
    //</editor-fold>

    //<editor-fold desc="On-Click Listeners" defaultstate="collapsed">
    @Override
    public void onLoginClick(View view) {

        validator.validateEmail(user.getEmail());
        validator.validatePassword(user.getPassword());

        notifyPropertyChanged(BR.passwordError);
        notifyPropertyChanged(BR.emailError);

        // TODO: Always FALSE doesn't open new activity. (p)
        if (validator.isValid())
            connector.login(user);
        else
            Toast.makeText(context, R.string.toast_error_input, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onCreateUserClick(View view) {
        Intent intent = new Intent(context, CreateUserActivity.class);
        context.startActivity(intent);
    }
    //</editor-fold>

    //<editor-fold desc="Validators" defaultstate="collapsed">
    @Bindable
    @Override
    public String getEmailError() {
        return validator.getEmailErrorMessage();
    }

    @Bindable
    @Override
    public String getPasswordError() {
        return validator.getPasswordErrorMessage();
    }
    //</editor-fold>

}
