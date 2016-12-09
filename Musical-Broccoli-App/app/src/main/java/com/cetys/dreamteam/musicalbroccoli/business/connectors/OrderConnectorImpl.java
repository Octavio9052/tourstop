package com.cetys.dreamteam.musicalbroccoli.business.connectors;

import android.content.Context;

import com.cetys.dreamteam.musicalbroccoli.business.connectors.contracts.OrderConnector;
import com.cetys.dreamteam.musicalbroccoli.core.models.Order;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.Filter;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.ReadRequest;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.ReadWriteRequest;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.builders.ReadRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.builders.ReadWriteRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.services.OrderService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @Author J. Pichardo on 12/7/2016.
 */

public class OrderConnectorImpl extends BaseConnectorImpl<Order> implements OrderConnector {

    //<editor-fold desc="Instance Properties" defaultstate="collapsed">
    private final OrderService service;
    private Callback<List<Order>> createCallback;
    private Callback<Boolean> updateDeleteCallback;
    //</editor-fold>

    public OrderConnectorImpl(Context context, ReadWriteRequestBuilder<Order> readWriteRequestBuilder,
                              ReadRequestBuilder readRequestBuilder, OrderService service) {
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
    public List<Order> getAll() throws IOException {
        return getByFilters(new ArrayList<Filter>());
    }

    @Override
    public Order getById(int id) throws IOException {
        Filter idFilter = new Filter()
                .setPropertyName("id")
                .setRelationship("=")
                .setValue(Integer.toString(id));

        List<Filter> filterList = new ArrayList<>();
        filterList.add(idFilter);

        return getByFilters(filterList).get(0);
    }

    @Override
    public List<Order> getByFilters(List<Filter> filters) throws IOException {
        ReadRequest request = readRequestBuilder.addFilters(filters).build();

        Call<List<Order>> call = service.get(request);
        Response<List<Order>> response = call.execute();
        if (response.isSuccessful()) {
            return response.body();
        } else {
            return null;
        }
    }

    @Override
    public void create(Order model) {
        ReadWriteRequest<Order> request = readWriteRequestBuilder.addData(model).build();

        service.create(request).enqueue(createCallback);
    }

    @Override
    public void update(Order model) {
        ReadWriteRequest<Order> request = readWriteRequestBuilder.addData(model).build();

        service.update(request).enqueue(updateDeleteCallback);
    }

    @Override
    public void delete(Order model) {
        ReadWriteRequest<Order> request = readWriteRequestBuilder.addData(model).build();

        service.delete(request).enqueue(updateDeleteCallback);
    }
    //</editor-fold>

    //<editor-fold desc="Callback Classes" defaultstate="collapsed">
    private class CreateCallback implements Callback<List<Order>> {

        @Override
        public void onResponse(Call<List<Order>> call, Response<List<Order>> response) {

        }

        @Override
        public void onFailure(Call<List<Order>> call, Throwable t) {

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
