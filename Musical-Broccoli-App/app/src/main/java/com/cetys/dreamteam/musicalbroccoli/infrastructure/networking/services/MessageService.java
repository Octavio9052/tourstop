package com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.services;

import com.cetys.dreamteam.musicalbroccoli.core.models.Message;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.ReadRequest;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.ReadWriteRequest;

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
public interface MessageService extends BaseService<Message> {

    @Override
    @GET("message/")
    Call<List<Message>> get(@Body ReadRequest request);

    @Override
    @POST("message/")
    Call<List<Message>> create(@Body ReadWriteRequest<Message> request);

    @Override
    @PUT("message/")
    Call update(@Body ReadWriteRequest<Message> request);

    @Override
    @DELETE("message/")
    Call delete(@Body ReadWriteRequest<Message> request);

}
