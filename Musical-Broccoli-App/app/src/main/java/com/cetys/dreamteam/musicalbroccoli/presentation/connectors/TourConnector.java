package com.cetys.dreamteam.musicalbroccoli.presentation.connectors;

import com.cetys.dreamteam.musicalbroccoli.networking.request.Filter;
import com.cetys.dreamteam.musicalbroccoli.networking.request.ReadRequest;
import com.cetys.dreamteam.musicalbroccoli.networking.request.ReadWriteRequest;
import com.cetys.dreamteam.musicalbroccoli.networking.request.builders.ReadRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.networking.request.builders.ReadWriteRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.networking.services.TourService;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.Tour;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @Author J. Pichardo on 12/7/2016.
 */

public class TourConnector extends BaseConnector<Tour> {

    private final TourService service;
    private Callback<List<Tour>> createCallback;
    private Callback<Boolean> updateDeleteCallback;

    public TourConnector(ReadWriteRequestBuilder<Tour> readWriteRequestBuilder,
                         ReadRequestBuilder readRequestBuilder, TourService service) {
        super(readWriteRequestBuilder, readRequestBuilder);
        this.service = service;
    }

    @Override
    protected void initCallbacks() {
        createCallback = new CreateCallback();
        updateDeleteCallback = new UpdateOrDeleteCallback();
    }

    @Override
    public List<Tour> getAll() throws IOException {
        return getByFilters(new ArrayList<Filter>());
    }

    @Override
    public Tour getById(int id) throws IOException {
        Filter idFilter = new Filter()
                .setPropertyName("id")
                .setRelationship("=")
                .setValue(Integer.toString(id));

        List<Filter> filterList = new ArrayList<>();
        filterList.add(idFilter);

        return getByFilters(filterList).get(0);
    }

    @Override
    public List<Tour> getByFilters(List<Filter> filters) throws IOException {
        ReadRequest request = readRequestBuilder.addFilters(filters).build();

        Call<List<Tour>> call = service.get(request);
        Response<List<Tour>> response = call.execute();
        if (response.isSuccessful()) {
            return response.body();
        } else {
            return null;
        }
    }

    @Override
    public void create(Tour model) {
        ReadWriteRequest<Tour> request = readWriteRequestBuilder.addData(model).build();

        service.create(request).enqueue(createCallback);
    }

    @Override
    public void update(Tour model) {
        ReadWriteRequest<Tour> request = readWriteRequestBuilder.addData(model).build();

        service.update(request).enqueue(updateDeleteCallback);
    }

    @Override
    public void delete(Tour model) {
        ReadWriteRequest<Tour> request = readWriteRequestBuilder.addData(model).build();

        service.delete(request).enqueue(updateDeleteCallback);
    }

    private class CreateCallback implements Callback<List<Tour>> {

        @Override
        public void onResponse(Call<List<Tour>> call, Response<List<Tour>> response) {

        }

        @Override
        public void onFailure(Call<List<Tour>> call, Throwable t) {

        }
    }

    private class UpdateOrDeleteCallback implements Callback<Boolean> {

        @Override
        public void onResponse(Call<Boolean> call, Response<Boolean> response) {

        }

        @Override
        public void onFailure(Call<Boolean> call, Throwable t) {

        }
    }

}
