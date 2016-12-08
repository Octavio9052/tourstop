package com.cetys.dreamteam.musicalbroccoli.business.connectors;

import android.content.Context;

import com.cetys.dreamteam.musicalbroccoli.business.connectors.contracts.UserConnector;
import com.cetys.dreamteam.musicalbroccoli.core.models.Session;
import com.cetys.dreamteam.musicalbroccoli.core.models.User;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.Filter;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.ReadRequest;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.ReadWriteRequest;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.builders.ReadRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.builders.ReadWriteRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.services.UserService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @Author J. Pichardo on 12/7/2016.
 */

public class UserConnectorImpl extends BaseConnectorImpl<User> implements UserConnector {

    //<editor-fold desc="Instance Properties" defaultstate="collapsed">
    private final UserService service;
    private Callback<List<User>> createCallback;
    private Callback<Boolean> updateDeleteCallback;
    private Callback<List<Session>> loginCallback;
    //</editor-fold>

    public UserConnectorImpl(Context context, ReadWriteRequestBuilder<User> readWriteRequestBuilder,
                             ReadRequestBuilder readRequestBuilder, UserService service) {
        super(context, readWriteRequestBuilder, readRequestBuilder);
        this.service = service;
    }

    @Override
    protected void initCallbacks() {
        createCallback = new CreateCallback();
        updateDeleteCallback = new UpdateOrDeleteCallback();
        loginCallback = new LoginCallback();
    }

    //<editor-fold desc="Service Methods" defaultstate="collapsed">
    @Override
    public List<User> getAll() throws IOException {
        return getByFilters(new ArrayList<Filter>());
    }

    @Override
    public User getById(int id) throws IOException {
        Filter idFilter = new Filter()
                .setPropertyName("id")
                .setRelationship("=")
                .setValue(Integer.toString(id));

        List<Filter> filterList = new ArrayList<>();
        filterList.add(idFilter);

        return getByFilters(filterList).get(0);
    }

    @Override
    public List<User> getByFilters(List<Filter> filters) throws IOException {
        ReadRequest request = readRequestBuilder.addFilters(filters).build();

        Call<List<User>> call = service.get(request);
        Response<List<User>> response = call.execute();
        if (response.isSuccessful()) {
            return response.body();
        } else {
            return null;
        }
    }

    @Override
    public void create(User user) {
        ReadWriteRequest<User> request = readWriteRequestBuilder.addData(user).build();

        service.create(request).enqueue(createCallback);
    }

    @Override
    public void update(User user) {
        ReadWriteRequest<User> request = readWriteRequestBuilder.addData(user).build();

        service.update(request).enqueue(updateDeleteCallback);
    }

    @Override
    public void delete(User user) {
        ReadWriteRequest<User> request = readWriteRequestBuilder.addData(user).build();

        service.delete(request).enqueue(updateDeleteCallback);
    }

    @Override
    public void login(User user) {
        ReadWriteRequest<User> request = readWriteRequestBuilder.addData(user).build();
        service.login(request).enqueue(loginCallback);

    }
    //</editor-fold>

    //<editor-fold desc="Callback Classes" defaultstate="collapsed">
    private class CreateCallback implements Callback<List<User>> {

        @Override
        public void onResponse(Call<List<User>> call, Response<List<User>> response) {

        }

        @Override
        public void onFailure(Call<List<User>> call, Throwable t) {

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

    private class LoginCallback implements Callback<List<Session>> {

        @Override
        public void onResponse(Call<List<Session>> call, Response<List<Session>> response) {
            if (response.isSuccessful()) {

            } else {
                //TODO: Wassup
            }
        }

        @Override
        public void onFailure(Call<List<Session>> call, Throwable t) {
//TODO: Wassup
        }
    }
    //</editor-fold>
}
