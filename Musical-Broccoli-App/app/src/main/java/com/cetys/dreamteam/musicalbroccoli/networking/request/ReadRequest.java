package com.cetys.dreamteam.musicalbroccoli.networking.request;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author J. Pichardo on 12/4/2016.
 */

public class ReadRequest extends BaseRequest {

    private List<Filter> filters;

    //<editor-fold desc="Property Accessors" defaulstate="collapsed">
    public List getFilters() {
        return filters;
    }

    public ReadRequest setFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }
    //</editor-fold>
    
    public ReadRequest addFilter(Filter filter) {
        if (filters == null) filters = new ArrayList<Filter>();
        filters.add(filter);
        return this;
    }

}
