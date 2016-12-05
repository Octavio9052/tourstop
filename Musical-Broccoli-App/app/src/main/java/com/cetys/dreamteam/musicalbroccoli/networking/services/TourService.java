package com.cetys.dreamteam.musicalbroccoli.networking.services;

import com.cetys.dreamteam.musicalbroccoli.commons.dtos.TourDto;
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
public interface TourService {

    @GET("tour/")
    Call<List<TourDto>> Get(@Body ReadRequest request);

    @POST("tour/")
    Call<List<TourDto>> Create(@Body ReadWriteRequest<TourDto> request);

    @PUT("tour/")
    Call Update(@Body ReadWriteRequest<TourDto> request);

    @DELETE("tour/")
    Call Delete(@Body ReadWriteRequest<TourDto> request);

}
