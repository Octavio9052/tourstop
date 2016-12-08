package com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request;

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

}
