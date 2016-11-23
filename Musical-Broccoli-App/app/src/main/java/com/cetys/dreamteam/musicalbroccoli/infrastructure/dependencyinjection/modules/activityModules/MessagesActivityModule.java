package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules;

import android.databinding.DataBindingUtil;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.databinding.MessagesActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.MessagesViewModelImpl;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.MessagesViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.MessagesActivity;

import dagger.Module;
import dagger.Provides;

/**
 * @Author J. Pichardo on 11/23/2016.
 */
@Module
public class MessagesActivityModule {

    private final MessagesActivity messagesActivity;


    public MessagesActivityModule( MessagesActivity messagesActivity ) {
        this.messagesActivity = messagesActivity;
    }

    @ActivityScope
    @Provides
    MessagesActivity providesMessagesActivity() {
        return this.messagesActivity;
    }

    @ActivityScope
    @Provides
    MessagesViewModel providesMessagesViewModel() {
        return new MessagesViewModelImpl( this.messagesActivity );
    }

    @ActivityScope
    @Provides
    MessagesActivityBinding providesMessagesActivityBinding() {
        return DataBindingUtil.setContentView( this.messagesActivity, R.layout.messages_activity );
    }

}
