package com.cetys.dreamteam.musicalbroccoli.networking.request;

import java.util.List;

/**
 * @Author J. Pichardo on 12/4/2016.
 */

public class ReadRequest extends BaseRequest {

    private List filters;

    public List getFilters() {
        return filters;
    }

    public void setFilters(List filters) {
        this.filters = filters;
    }

}
