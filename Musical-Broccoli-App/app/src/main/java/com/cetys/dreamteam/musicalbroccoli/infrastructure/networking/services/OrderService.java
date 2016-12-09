package com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.services;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.ReadRequest;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.ReadWriteRequest;
import com.cetys.dreamteam.musicalbroccoli.core.models.Order;

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
public interface OrderService {

    @GET("order/")
    Call<List<Order>> get(@Body ReadRequest request);

    @POST("order/")
    Call<List<Order>> create(@Body ReadWriteRequest<Order> request);

    @PUT("order/")
    Call<Boolean> update(@Body ReadWriteRequest<Order> request);

    @DELETE("order/")
    Call<Boolean> delete(@Body ReadWriteRequest<Order> request);

}
