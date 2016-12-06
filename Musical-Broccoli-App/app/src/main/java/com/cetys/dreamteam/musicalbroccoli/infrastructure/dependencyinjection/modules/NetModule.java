package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.cetys.dreamteam.musicalbroccoli.networking.services.UserService;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @Author J. Pichardo on 11/11/2016.
 */
@Module
public class NetModule {

    private String baseUrl;

    public NetModule(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Singleton
    @Provides
    SharedPreferences providesSharedPreferences(Application application) {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }

    @Singleton
    @Provides
    Cache providesOkHttpCache(Application application) {
        int cacheSize = 10 * 1024 * 1024; //10 Mib
        return new Cache(application.getCacheDir(), cacheSize);
    }

    @Singleton
    @Provides
    Gson providesGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        return gsonBuilder.create();
    }

    @Singleton
    @Provides
    Retrofit providesRetrofit(Gson gson, OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(baseUrl)
                .client(okHttpClient)
                .build();
    }

    @Provides
    UserService providesUserService(Retrofit retrofit) {
        return retrofit.create(UserService.class);
    }

}
