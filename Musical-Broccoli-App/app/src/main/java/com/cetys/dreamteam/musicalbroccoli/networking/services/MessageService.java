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
public interface MessageService extends BaseService<MessageDto> {

    @Override
    @GET("message/")
    Call<List<MessageDto>> get(@Body ReadRequest request);

    @Override
    @POST("message/")
    Call<List<MessageDto>> create(@Body ReadWriteRequest<MessageDto> request);

    @Override
    @PUT("message/")
    Call update(@Body ReadWriteRequest<MessageDto> request);

    @Override
    @DELETE("message/")
    Call delete(@Body ReadWriteRequest<MessageDto> request);

}
