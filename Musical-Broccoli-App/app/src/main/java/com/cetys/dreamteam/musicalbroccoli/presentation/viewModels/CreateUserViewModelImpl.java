package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.UserModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.CreateUserViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.MainPageActivity;

/**
 * Created by Octavio on 2016/12/04.
 */

public class CreateUserViewModelImpl extends BaseViewModel implements CreateUserViewModel {
    private UserModel user;
    boolean isPromoter, isUser;

    public CreateUserViewModelImpl(Context context) {
        super(context);
    }

    @Override
    public UserModel getUser() {
        return this.user;
    }

    @Override
    public void setUser(UserModel user) {
        this.user = user;
    }

    @Override
    public void onSaveChangesClick(View view) {
        doTemporalToast();
        Intent intent = new Intent(context, MainPageActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onRadioButtonClick(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.type_promoter:
                changeState(checked, !checked);
                break;
            case R.id.type_user:
                changeState(!checked, checked);
                break;
        }
    }

    private void changeState(boolean isPromoter, boolean isUser){
        this.isPromoter = isPromoter;
        this.isUser = isUser;
    }

    private void doTemporalToast(){
        Toast.makeText(context, "New user created",Toast.LENGTH_LONG).show();
    }
}
