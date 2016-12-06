package com.cetys.dreamteam.musicalbroccoli.networking.services;

import com.cetys.dreamteam.musicalbroccoli.commons.dtos.MessageModel;
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
public interface MessageService extends BaseService<MessageModel> {

    @Override
    @GET("message/")
    Call<List<MessageModel>> get(@Body ReadRequest request);

    @Override
    @POST("message/")
    Call<List<MessageModel>> create(@Body ReadWriteRequest<MessageModel> request);

    @Override
    @PUT("message/")
    Call update(@Body ReadWriteRequest<MessageModel> request);

    @Override
    @DELETE("message/")
    Call delete(@Body ReadWriteRequest<MessageModel> request);

}
