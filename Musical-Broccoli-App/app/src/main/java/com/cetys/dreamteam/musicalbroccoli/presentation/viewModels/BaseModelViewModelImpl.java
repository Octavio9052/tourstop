package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.networking.request.ReadWriteRequest;
import com.cetys.dreamteam.musicalbroccoli.networking.services.BaseService;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.BaseModelViewModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @Author J. Pichardo on 12/5/2016.
 */

abstract class BaseModelViewModelImpl<T> extends BaseViewModel implements BaseModelViewModel<T> {

    //<editor-fold desc="Instance Properties" defaultstate="collapsed">
    protected BaseService<T> service;
    protected T model;
    private Callback<List<T>> getByIdCallback;
    private Callback<List<T>> createCallback;
    private Callback<?> updateAndDeleteCallback;
    //</editor-fold>

    BaseModelViewModelImpl(Context context, BaseService<T> service) {
        super(context);
        this.service = service;
        initCallbacks();
    }

    //<editor-fold desc="Init Methods" defaultstate="collapsed">

    @Override
    protected void initCallbacks() {
        createCallback = new CreateCallback();
        updateAndDeleteCallback = new UpdateAndDeleteCallback();
    }

    //</editor-fold>

    //<editor-fold desc="Property Accessors" defaulstate="collapsed">
    public T getModel() {
        return model;
    }

    public BaseModelViewModelImpl<T> setModel(T model) {
        this.model = model;
        return this;
    }
    //</editor-fold>

    //<editor-fold desc="Service Delegates" defaultstate="collapsed">F
    public void create() {

        ReadWriteRequest<T> request = new ReadWriteRequest<T>()
                .addModel(model);

        Call<List<T>> call = service.create(request);
        call.enqueue(createCallback);
    }

    public void update() {
        ReadWriteRequest<T> request = new ReadWriteRequest<T>()
                .addModel(model);

        Call call = service.update(request);
        call.enqueue(updateAndDeleteCallback);
    }

    protected void delete() {
        ReadWriteRequest<T> request = new ReadWriteRequest<T>()
                .addModel(model);

        Call call = service.delete(request);
        call.enqueue(updateAndDeleteCallback);
    }
    //</editor-fold>

    //<editor-fold desc="Callback Classes" defaultstate="collapsed">
    private class CreateCallback implements Callback<List<T>> {

        static final String UNSUCCESSFUL_RESPONSE_MESSAGE = "Could not be created";
        static final String SERVER_FAILURE_MESSAGE = "Server had an unexpected error";

        @Override
        public void onResponse(Call<List<T>> call, Response<List<T>> response) {
            if (response.isSuccessful()) {
                List<T> list = response.body();
                model = list.get(0);
            } else {
                Toast.makeText(context, UNSUCCESSFUL_RESPONSE_MESSAGE, Toast.LENGTH_LONG).show();
            }
        }

        @Override
        public void onFailure(Call<List<T>> call, Throwable t) {
            Toast.makeText(context, SERVER_FAILURE_MESSAGE, Toast.LENGTH_LONG).show();
        }
    }

    private class UpdateAndDeleteCallback implements Callback {

        static final String SUCCESSFUL_RESPONSE_MESSAGE = "Modification was successful";
        static final String UNSUCCESSFUL_RESPONSE_MESSAGE = "An unexpected error occured";
        static final String SERVER_ERROR_MESSAGE = "An unexpected error ocurred";

        @Override
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                Toast.makeText(context, SUCCESSFUL_RESPONSE_MESSAGE, Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(context, UNSUCCESSFUL_RESPONSE_MESSAGE, Toast.LENGTH_LONG).show();
            }
        }

        @Override
        public void onFailure(Call call, Throwable t) {
            Toast.makeText(context, SERVER_ERROR_MESSAGE, Toast.LENGTH_LONG).show();
        }
    }
    //</editor-fold>

}