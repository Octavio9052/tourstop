package com.cetys.dreamteam.musicalbroccoli.presentation.connectors;

import com.cetys.dreamteam.musicalbroccoli.networking.request.Filter;
import com.cetys.dreamteam.musicalbroccoli.networking.request.ReadRequest;
import com.cetys.dreamteam.musicalbroccoli.networking.request.ReadWriteRequest;
import com.cetys.dreamteam.musicalbroccoli.networking.request.builders.ReadRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.networking.request.builders.ReadWriteRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.networking.services.OrderService;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.OrderModel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @Author J. Pichardo on 12/7/2016.
 */

public class OrderConnector extends BaseConnector<OrderModel> {

    private final OrderService service;
    private Callback<List<OrderModel>> createCallback;
    private Callback<Boolean> updateDeleteCallback;

    public OrderConnector(ReadWriteRequestBuilder<OrderModel> readWriteRequestBuilder,
                          ReadRequestBuilder readRequestBuilder, OrderService service) {
        super(readWriteRequestBuilder, readRequestBuilder);
        this.service = service;
    }

    @Override
    protected void initCallbacks() {
        createCallback = new CreateCallback();
        updateDeleteCallback = new UpdateOrDeleteCallback();
    }

    @Override
    public List<OrderModel> getAll() throws IOException {
        return getByFilters(new ArrayList<Filter>());
    }

    @Override
    public OrderModel getById(int id) throws IOException {
        Filter idFilter = new Filter()
                .setPropertyName("id")
                .setRelationship("=")
                .setValue(Integer.toString(id));

        List<Filter> filterList = new ArrayList<>();
        filterList.add(idFilter);

        return getByFilters(filterList).get(0);
    }

    @Override
    public List<OrderModel> getByFilters(List<Filter> filters) throws IOException {
        ReadRequest request = readRequestBuilder.addFilters(filters).build();

        Call<List<OrderModel>> call = service.get(request);
        Response<List<OrderModel>> response = call.execute();
        if (response.isSuccessful()) {
            return response.body();
        } else {
            return null;
        }
    }

    @Override
    public void create(OrderModel model) {
        ReadWriteRequest<OrderModel> request = readWriteRequestBuilder.addData(model).build();

        service.create(request).enqueue(createCallback);
    }

    @Override
    public void update(OrderModel model) {
        ReadWriteRequest<OrderModel> request = readWriteRequestBuilder.addData(model).build();

        service.update(request).enqueue(updateDeleteCallback);
    }

    @Override
    public void delete(OrderModel model) {
        ReadWriteRequest<OrderModel> request = readWriteRequestBuilder.addData(model).build();

        service.delete(request).enqueue(updateDeleteCallback);
    }

    private class CreateCallback implements Callback<List<OrderModel>> {

        @Override
        public void onResponse(Call<List<OrderModel>> call, Response<List<OrderModel>> response) {

        }

        @Override
        public void onFailure(Call<List<OrderModel>> call, Throwable t) {

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
