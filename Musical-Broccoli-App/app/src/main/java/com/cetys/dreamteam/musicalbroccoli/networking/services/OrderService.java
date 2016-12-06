package com.cetys.dreamteam.musicalbroccoli.networking.services;

import com.cetys.dreamteam.musicalbroccoli.commons.dtos.OrderModel;
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
public interface OrderService extends BaseService<OrderModel> {

    @Override
    @GET("order/")
    Call<List<OrderModel>> get(@Body ReadRequest request);

    @Override
    @POST("order/")
    Call<List<OrderModel>> create(@Body ReadWriteRequest<OrderModel> request);

    @Override
    @PUT("order/")
    Call update(@Body ReadWriteRequest<OrderModel> request);

    @Override
    @DELETE("order/")
    Call delete(@Body ReadWriteRequest<OrderModel> request);


}
