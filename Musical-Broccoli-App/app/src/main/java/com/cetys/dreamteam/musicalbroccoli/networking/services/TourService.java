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
public interface TourService extends BaseService<TourDto> {

    @Override
    @GET("tour/")
    Call<List<TourDto>> get(@Body ReadRequest request);

    @Override
    @POST("tour/")
    Call<List<TourDto>> create(@Body ReadWriteRequest<TourDto> request);

    @Override
    @PUT("tour/")
    Call update(@Body ReadWriteRequest<TourDto> request);

    @Override
    @DELETE("tour/")
    Call delete(@Body ReadWriteRequest<TourDto> request);


}
