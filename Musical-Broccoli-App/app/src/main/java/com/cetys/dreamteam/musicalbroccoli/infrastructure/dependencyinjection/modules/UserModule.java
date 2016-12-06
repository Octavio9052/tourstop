package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules;

import com.cetys.dreamteam.musicalbroccoli.presentation.models.UserModel;

import dagger.Module;

/**
 * @Author J. Pichardo on 11/11/2016.
 */
@Module
public class UserModule {

    private UserModel user;

    public UserModule(UserModel user) {
        this.user = user;
    }
}
