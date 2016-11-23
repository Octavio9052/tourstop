package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.MessageModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.MessagesViewModel;

/**
 * Created by Octavio on 2016/11/20.
 */

public class MessagesViewModelImpl extends BaseViewModel implements MessagesViewModel {
    private MessageModel message;

    public MessagesViewModelImpl(Context context) {
        super(context);
    }

    @Override
    public MessageModel getMessage() {
        return this.message;
    }

    @Override
    public void setMessage(MessageModel message) {
        this.message = message;
    }
}
