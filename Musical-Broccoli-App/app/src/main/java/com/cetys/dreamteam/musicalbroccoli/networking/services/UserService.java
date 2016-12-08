package com.cetys.dreamteam.musicalbroccoli.networking.services;

import com.cetys.dreamteam.musicalbroccoli.networking.request.ReadRequest;
import com.cetys.dreamteam.musicalbroccoli.networking.request.ReadWriteRequest;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;

/**
 * @Author J. Pichardo on 12/4/2016.
 */
public interface UserService {

    @GET("user/")
    Call<List<User>> get(@Body ReadRequest request);

    @POST("user/")
    Call<List<User>> create(@Body ReadWriteRequest<User> request);

    @PUT("user/")
    Call update(@Body ReadWriteRequest<User> request);

    @DELETE("user/")
    Call delete(@Body ReadWriteRequest<User> request);

}
