package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules.MessagesActivityModule;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.MessagesActivity;

import dagger.Subcomponent;

/**
 * @Author J. Pichardo on 11/23/2016.
 */
@Subcomponent( modules = MessagesActivityModule.class )
public interface MessagesActivitySubcomponent {
    void inject( MessagesActivity messagesActivity );
}
