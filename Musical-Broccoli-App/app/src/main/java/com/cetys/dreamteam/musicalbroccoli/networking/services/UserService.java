package com.cetys.dreamteam.musicalbroccoli.networking.services;

import com.cetys.dreamteam.musicalbroccoli.commons.dtos.UserDto;
import com.cetys.dreamteam.musicalbroccoli.networking.request.ReadRequest;
import com.cetys.dreamteam.musicalbroccoli.networking.request.ReadWriteRequest;

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
public interface UserService extends BaseService<UserDto> {

    @Override
    @GET("user/")
    Call<List<UserDto>> get(@Body ReadRequest request);

    @Override
    @POST("user/")
    Call<List<UserDto>> create(@Body ReadWriteRequest<UserDto> request);

    @Override
    @PUT("user/")
    Call update(@Body ReadWriteRequest<UserDto> request);

    @Override
    @DELETE("user/")
    Call delete(@Body ReadWriteRequest<UserDto> request);

}
