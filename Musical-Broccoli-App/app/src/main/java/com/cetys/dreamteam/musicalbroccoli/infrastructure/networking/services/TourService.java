package com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.services;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.ReadRequest;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.ReadWriteRequest;
import com.cetys.dreamteam.musicalbroccoli.core.models.Tour;

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
public interface TourService {

    @GET("tour/")
    Call<List<Tour>> get(@Body ReadRequest request);

    @POST("tour/")
    Call<List<Tour>> create(@Body ReadWriteRequest<Tour> request);

    @PUT("tour/")
    Call update(@Body ReadWriteRequest<Tour> request);

    @DELETE("tour/")
    Call delete(@Body ReadWriteRequest<Tour> request);

}
