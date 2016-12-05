package com.cetys.dreamteam.musicalbroccoli.presentation.connectors;

import android.databinding.ObservableArrayList;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.networking.request.Filter;
import com.cetys.dreamteam.musicalbroccoli.networking.request.ReadRequest;
import com.cetys.dreamteam.musicalbroccoli.networking.request.ReadWriteRequest;
import com.cetys.dreamteam.musicalbroccoli.networking.services.BaseService;
import com.cetys.dreamteam.musicalbroccoli.presentation.connectors.contracts.BaseConnector;
import com.cetys.dreamteam.musicalbroccoli.presentation.models.BaseModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @Author J. Pichardo on 11/11/2016.
 */

public abstract class BaseConnectorImpl<TModel extends BaseModel>
        implements BaseConnector<TModel> {

    private BaseService<TModel> service;
    private Callback<List<TModel>> getCallback;
    private Callback<TModel> createCallback;
    private Callback<Boolean> updateAndDeleteCallback;

    public BaseConnectorImpl(BaseService<TModel> service) {
        this.service = service;
    }

    @Override
    public TModel getById(int id) {
        Filter idFilter = new Filter()
                .setPropertyName("id")
                .setRelationship("=")
                .setValue(Integer.toString(id));

        ArrayList<Filter> filterList = new ArrayList<>();
        filterList.add(idFilter);

        return getByFilters(filterList).get(0);
    }

    @Override
    public ObservableArrayList<TModel> getByFilters(List<Filter> filters) {

        ReadRequest request = new ReadRequest().setFilters(filters);

        //TODO
        throw new UnsupportedOperationException("Not Supported Yet");
    }

    @Override
    public ObservableArrayList<TModel> getAll() {
        return getByFilters(new ArrayList<Filter>());
    }

    @Override
    public TModel create(TModel model) {

        ReadWriteRequest<TModel> request = new ReadWriteRequest<TModel>()
                .addModel(model);

        //TODO
        throw new UnsupportedOperationException("Not Supported Yet");
    }

    @Override
    public boolean update(TModel model) {
        ReadWriteRequest<TModel> request = new ReadWriteRequest<TModel>()
                .addModel(model);

        //TODO
        throw new UnsupportedOperationException("Not Supported Yet");
    }

    @Override
    public boolean delete(TModel model) {
        ReadWriteRequest<TModel> request = new ReadWriteRequest<TModel>()
                .addModel(model);

        //TODO
        throw new UnsupportedOperationException("Not Supported Yet");
    }

    private class CreateCallback implements Callback<TModel> {

        @Override
        public void onResponse(Call<TModel> call, Response<TModel> response) {
            if (response.isSuccessful()) {
                TModel model = response.body();
            } else {
                Toast.makeText()

            }
        }

        @Override
        public void onFailure(Call<TModel> call, Throwable t) {

        }
    }
}
