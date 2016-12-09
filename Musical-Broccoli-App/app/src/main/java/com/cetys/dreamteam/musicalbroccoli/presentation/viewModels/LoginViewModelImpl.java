package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.business.connectors.contracts.UserConnector;
import com.cetys.dreamteam.musicalbroccoli.core.models.User;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.LoginViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.CreateUserActivity;

import com.wesleyelliott.kubwa.annotation.Email;
import com.wesleyelliott.kubwa.annotation.Password;
import com.wesleyelliott.kubwa.rule.PasswordRule;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Octavio on 2016/11/16.
 */

@Email(errorMessage = R.string.error_invalid_email)
@Password(errorMessage = R.string.error_invalid_password, scheme = PasswordRule.Scheme.ALPHA_NUMERIC_SYMBOLS)
public class LoginViewModelImpl extends BaseViewModel implements LoginViewModel {

    //<editor-fold desc="Instance Properties" defaultstate="collapsed">
    private static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    private LoginViewModelImplValidator validator;
    private String email;
    private String password;

    private final UserConnector connector;
    private User user;
    //</editor-fold>

    public LoginViewModelImpl(Context context, UserConnector connector) {
        super(context);
        this.connector = connector;
        validator = new LoginViewModelImplValidator(context);

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
        connector.login(user);
    }

    @Override
    public void onCreateUserClick(View view) {
        Intent intent = new Intent(context, CreateUserActivity.class);
        context.startActivity(intent);
    }
    //</editor-fold>

    //<editor-fold desc="Validators for Login form" defaultstate="collapsed">
    private boolean isEmailValid(){
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(user.getEmail());
        return matcher.find();
    }
    //</editor-fold>

}
