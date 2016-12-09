package com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.services;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.ReadRequest;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.ReadWriteRequest;

import java.util.List;

import retrofit2.Call;

/**
 * @Author J. Pichardo on 12/5/2016.
 */

public interface BaseService<T> {
    Call<List<T>> get(ReadRequest request);

    Call<List<T>> create(ReadWriteRequest<T> request);

    Call update(ReadWriteRequest<T> request);

    Call delete(ReadWriteRequest<T> request);
}
