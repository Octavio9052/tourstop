package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels;

import android.content.Context;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.networking.request.ReadWriteRequest;
import com.cetys.dreamteam.musicalbroccoli.networking.services.BaseService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @Author J. Pichardo on 12/5/2016.
 */

public abstract class BaseModelViewModel<T> extends BaseViewModel {

    //<editor-fold desc="Instance Properties" defaultstate="collapsed">
    private final BaseService<T> baseService;

    private Callback<List<T>> getByIdCallback;
    private Callback<List<T>> createCallback;
    private Callback<?> updateAndDeleteCallback;

    private T model;
    //</editor-fold>

    protected BaseModelViewModel(Context context, BaseService<T> baseService) {
        super(context);
        this.baseService = baseService;
    }

    //<editor-fold desc="Service Delegates" defaultstate="collapsed">
    public void create(T model) {

        ReadWriteRequest<T> request = new ReadWriteRequest<T>()
                .addModel(model);

        Call<List<T>> call = baseService.create(request);
        call.enqueue(createCallback);
    }

    public void update(T model) {
        ReadWriteRequest<T> request = new ReadWriteRequest<T>()
                .addModel(model);

        Call call = baseService.update(request);
        call.enqueue(updateAndDeleteCallback);
    }

    public void delete(T model) {
        ReadWriteRequest<T> request = new ReadWriteRequest<T>()
                .addModel(model);

        Call call = baseService.delete(request);
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
