package com.cetys.dreamteam.musicalbroccoli.business.connectors;

import android.content.Context;

import com.cetys.dreamteam.musicalbroccoli.business.connectors.contracts.TourConnector;
import com.cetys.dreamteam.musicalbroccoli.core.models.Tour;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.Filter;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.ReadRequest;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.ReadWriteRequest;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.builders.ReadRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.builders.ReadWriteRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.services.TourService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @Author J. Pichardo on 12/7/2016.
 */

public class TourConnectorImpl extends BaseConnectorImpl<Tour> implements TourConnector {

    //<editor-fold desc="Instance Properties" defaultstate="collapsed">
    private final TourService service;
    private Callback<List<Tour>> createCallback;
    private Callback<Boolean> updateDeleteCallback;
    //</editor-fold>

    public TourConnectorImpl(Context context, ReadWriteRequestBuilder<Tour> readWriteRequestBuilder,
                             ReadRequestBuilder readRequestBuilder, TourService service) {
        super(context, readWriteRequestBuilder, readRequestBuilder);
        this.service = service;
    }

    @Override
    protected void initCallbacks() {
        createCallback = new CreateCallback();
        updateDeleteCallback = new UpdateOrDeleteCallback();
    }

    //<editor-fold desc="Service Methods" defaultstate="collapsed">
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
    //</editor-fold>

    //<editor-fold desc="Callback Classes" defaultstate="collapsed">
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
    //</editor-fold>

}
