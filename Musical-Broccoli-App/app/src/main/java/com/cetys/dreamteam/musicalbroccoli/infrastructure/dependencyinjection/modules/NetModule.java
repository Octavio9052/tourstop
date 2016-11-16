package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

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

    public NetModule( String baseUrl ) {
        this.baseUrl = baseUrl;
    }

    @Provides
    @Singleton
    SharedPreferences providesSharedPreferences( Application application ) {
        return PreferenceManager.getDefaultSharedPreferences( application );
    }

    @Provides
    @Singleton
    Cache providesOkHttpCache( Application application ) {
        int cacheSize = 10 * 1024 * 1024; //10 Mib
        return new Cache( application.getCacheDir(), cacheSize );
    }

    @Provides
    @Singleton
    Gson providesGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy( FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES );
        return gsonBuilder.create();
    }

    @Provides
    @Singleton
    Retrofit providesRetrofit( Gson gson, OkHttpClient okHttpClient ) {
        return new Retrofit.Builder()
                .addConverterFactory( GsonConverterFactory.create( gson ) )
                .baseUrl( baseUrl )
                .client( okHttpClient )
                .build();
    }

}
