package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;

import com.cetys.dreamteam.musicalbroccoli.core.models.Message;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.MessagesViewModel;

/**
 * Created by Octavio on 2016/11/20.
 */

public class MessagesViewModelImpl extends BaseViewModel implements MessagesViewModel {
    private Message message;

    public MessagesViewModelImpl(Context context) {
        super(context);
    }

    @Override
    protected void load() {

    }

    @Override
    public Message getMessage() {
        return this.message;
    }

    @Override
    public void setMessage(Message message) {
        this.message = message;
    }
}
