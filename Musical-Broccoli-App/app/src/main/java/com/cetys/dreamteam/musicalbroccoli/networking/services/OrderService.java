package com.cetys.dreamteam.musicalbroccoli.networking.services;

import com.cetys.dreamteam.musicalbroccoli.commons.dtos.OrderDto;
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
public interface OrderService {

    @GET("order/")
    Call<List<OrderDto>> Get(@Body ReadRequest request);

    @POST("order/")
    Call<List<OrderDto>> Create(@Body ReadWriteRequest<OrderDto> request);

    @PUT("order/")
    Call Update(@Body ReadWriteRequest<OrderDto> request);

    @DELETE("order/")
    Call Delete(@Body ReadWriteRequest<OrderDto> request);

}
