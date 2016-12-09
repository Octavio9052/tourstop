package com.cetys.dreamteam.musicalbroccoli.business.connectors;

import android.content.Context;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.business.connectors.contracts.BaseConnector;
import com.cetys.dreamteam.musicalbroccoli.core.models.BaseModel;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.builders.ReadRequestBuilder;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request.builders.ReadWriteRequestBuilder;

/**
 * @Author J. Pichardo on 12/7/2016.
 */

public abstract class BaseConnectorImpl<T extends BaseModel> implements BaseConnector<T> {

    //<editor-fold desc="Instance Properties" defaultstate="collapsed">
    protected final Context context;
    protected final ReadWriteRequestBuilder<T> readWriteRequestBuilder;
    protected final ReadRequestBuilder readRequestBuilder;
    //</editor-fold>

    protected BaseConnectorImpl(Context context, ReadWriteRequestBuilder<T> readWriteRequestBuilder,
                                ReadRequestBuilder readRequestBuilder) {
        this.context = context;
        this.readWriteRequestBuilder = readWriteRequestBuilder;
        this.readRequestBuilder = readRequestBuilder;

        initCallbacks();
    }

    protected abstract void initCallbacks();

    protected void showServerErrorToast() {
        Toast.makeText(context, "An unexpected error occurred", Toast.LENGTH_LONG).show();
    }

}
