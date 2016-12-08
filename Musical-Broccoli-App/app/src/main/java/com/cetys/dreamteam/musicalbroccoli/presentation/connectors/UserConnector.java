package com.cetys.dreamteam.musicalbroccoli.presentation.connectors;

import com.cetys.dreamteam.musicalbroccoli.networking.request.Filter;
import com.cetys.dreamteam.musicalbroccoli.networking.request.ReadRequest;
import com.cetys.dreamteam.musicalbroccoli.networking.request.ReadWriteRequest;
import com.cetys.dreamteam.musicalbroccoli.networking.request.builders.ReadRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.networking.request.builders.ReadWriteRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.networking.services.UserService;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.UserModel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @Author J. Pichardo on 12/7/2016.
 */

public class UserConnector extends BaseConnector<UserModel> {

    private final UserService service;
    private Callback<List<UserModel>> createCallback;
    private Callback<Boolean> updateDeleteCallback;

    public UserConnector(ReadWriteRequestBuilder<UserModel> readWriteRequestBuilder,
                         ReadRequestBuilder readRequestBuilder, UserService service) {
        super(readWriteRequestBuilder, readRequestBuilder);
        this.service = service;
    }


    @Override
    protected void initCallbacks() {
        createCallback = new CreateCallback();
        updateDeleteCallback = new UpdateOrDeleteCallback();
    }

    @Override
    public List<UserModel> getAll() throws IOException {
        return getByFilters(new ArrayList<Filter>());
    }

    @Override
    public UserModel getById(int id) throws IOException {
        Filter idFilter = new Filter()
                .setPropertyName("id")
                .setRelationship("=")
                .setValue(Integer.toString(id));

        List<Filter> filterList = new ArrayList<>();
        filterList.add(idFilter);

        return getByFilters(filterList).get(0);
    }

    @Override
    public List<UserModel> getByFilters(List<Filter> filters) throws IOException {
        ReadRequest request = readRequestBuilder.addFilters(filters).build();

        Call<List<UserModel>> call = service.get(request);
        Response<List<UserModel>> response = call.execute();
        if (response.isSuccessful()) {
            return response.body();
        } else {
            return null;
        }
    }

    @Override
    public void create(UserModel model) {
        ReadWriteRequest<UserModel> request = readWriteRequestBuilder.addData(model).build();

        service.create(request).enqueue(createCallback);
    }

    @Override
    public void update(UserModel model) {
        ReadWriteRequest<UserModel> request = readWriteRequestBuilder.addData(model).build();

        service.update(request).enqueue(updateDeleteCallback);
    }

    @Override
    public void delete(UserModel model) {
        ReadWriteRequest<UserModel> request = readWriteRequestBuilder.addData(model).build();

        service.delete(request).enqueue(updateDeleteCallback);
    }

    private class CreateCallback implements Callback<List<UserModel>> {

        @Override
        public void onResponse(Call<List<UserModel>> call, Response<List<UserModel>> response) {

        }

        @Override
        public void onFailure(Call<List<UserModel>> call, Throwable t) {

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
