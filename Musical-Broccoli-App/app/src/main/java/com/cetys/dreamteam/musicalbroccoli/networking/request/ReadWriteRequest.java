package com.cetys.dreamteam.musicalbroccoli.networking.request;

import java.util.List;

/**
 * @Author J. Pichardo on 12/4/2016.
 */

public class ReadWriteRequest<T> extends BaseRequest {

    private List<T> data;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

}
