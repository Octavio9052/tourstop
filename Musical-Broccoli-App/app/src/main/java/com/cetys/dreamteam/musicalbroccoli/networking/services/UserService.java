package com.cetys.dreamteam.musicalbroccoli.networking.services;

import com.cetys.dreamteam.musicalbroccoli.networking.request.ReadRequest;
import com.cetys.dreamteam.musicalbroccoli.networking.request.ReadWriteRequest;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.UserModel;

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
public interface UserService extends BaseService<UserModel> {

    @Override
    @GET("user/")
    Call<List<UserModel>> get(@Body ReadRequest request);

    @Override
    @POST("user/")
    Call<List<UserModel>> create(@Body ReadWriteRequest<UserModel> request);

    @Override
    @PUT("user/")
    Call update(@Body ReadWriteRequest<UserModel> request);

    @Override
    @DELETE("user/")
    Call delete(@Body ReadWriteRequest<UserModel> request);

}
