package com.cetys.dreamteam.musicalbroccoli.networking.services;

import com.cetys.dreamteam.musicalbroccoli.commons.dtos.MessageDto;
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
public interface MessageService {

    @GET("message/")
    Call<List<MessageDto>> Get(@Body ReadRequest request);

    @POST("message/")
    Call<List<MessageDto>> Create(@Body ReadWriteRequest<MessageDto> request);

    @PUT("message/")
    Call Update(@Body ReadWriteRequest<MessageDto> request);

    @DELETE("message/")
    Call Delete(@Body ReadWriteRequest<MessageDto> request);

}
