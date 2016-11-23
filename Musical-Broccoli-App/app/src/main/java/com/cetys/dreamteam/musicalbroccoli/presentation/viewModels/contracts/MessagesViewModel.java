package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.MessageModel;

/**
 * Created by Octavio on 2016/11/20.
 */

public interface MessagesViewModel {
    MessageModel getMessage();
    void setMessage(MessageModel message);
}
