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
public interface UserService {

    @GET("user/")
    Call<List<UserDto>> Get(@Body ReadRequest request);

    @POST("user/")
    Call<List<UserDto>> Create(@Body ReadWriteRequest<UserDto> request);

    @PUT("user/")
    Call Update(@Body ReadWriteRequest<UserDto> request);

    @DELETE("user/")
    Call Delete(@Body ReadWriteRequest<UserDto> request);

}
