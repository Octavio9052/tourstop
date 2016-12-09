package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.BR;

import com.cetys.dreamteam.musicalbroccoli.business.connectors.contracts.UserConnector;
import com.cetys.dreamteam.musicalbroccoli.core.models.User;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.EditUserViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.ChangePasswordActivity;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.PaymentOptionsActivity;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.UserProfileActivity;
import com.wesleyelliott.kubwa.annotation.Email;
import com.wesleyelliott.kubwa.annotation.NotNull;

/**
 * Created by Octavio on 2016/11/20.
 */

@Email(errorMessage = R.string.error_invalid_email)
@NotNull(errorMessage = R.string.error_field_required)
public class EditUserViewModelImpl extends BaseViewModel implements EditUserViewModel {

    //<editor-fold desc="Instance Properties" defaultstate="collapsed">
    private final EditUserViewModelImplValidator validator;
    private final UserConnector connector;
    private User user;
    //</editor-fold>

    public EditUserViewModelImpl(Context context, UserConnector connector, EditUserViewModelImplValidator validator) {
        super(context);
        this.connector = connector;
        this.validator = validator;

        load();
    }

    //<editor-fold desc="Property Accessors" defaultstate="collaped">
    @Override
    public User getUser() {
        return this.user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
    }
    //</editor-fold>

    //<editor-fold desc="On-Click Listeners" defaultstate="collapsed">
    @Override
    public void onChangePasswordClick(View view) {
        Intent intent = new Intent(context, ChangePasswordActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onChangePaymentClick(View view) {
        Intent intent = new Intent(context, PaymentOptionsActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onSaveChangesClick(View view) {
        // TODO: Null objet creash (p)
        validator.validateNotNull(user.getFirstName());
        validator.validateNotNull(user.getLastName());
        validator.validateEmail(user.getEmail());

        notifyPropertyChanged(BR.emailError);

        // TODO: connector opens activity? (p).
        if(validator.isValid()) {
            connector.update(user);
            Intent intent = new Intent(context, UserProfileActivity.class);
            context.startActivity(intent);
        }
        else
            Toast.makeText(context, R.string.toast_error_input, Toast.LENGTH_LONG).show();

    }
    //</editor-fold>

    @Override
    protected void load() {
        user = new User();
    }
}
