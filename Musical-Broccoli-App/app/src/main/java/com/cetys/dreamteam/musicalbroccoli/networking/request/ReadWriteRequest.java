package com.cetys.dreamteam.musicalbroccoli.networking.request;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author J. Pichardo on 12/4/2016.
 */

public class ReadWriteRequest<T> extends BaseRequest {

    private List<T> data;

    //<editor-fold desc="Property Accessors" defaulstate="collapsed">
    public List<T> getData() {
        return data;
    }

    public ReadWriteRequest<T> setData(List<T> data) {
        this.data = data;
        return this;
    }
    //</editor-fold>

    public ReadWriteRequest<T> addModel(T model) {
        if (data == null) data = new ArrayList<>();
        data.add(model);

        return this;
    }

}
