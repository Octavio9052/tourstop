package com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts;

/**
 * @Author J. Pichardo on 12/5/2016.
 */
public interface BaseModelViewModel<T> {
    T getModel();

    BaseModelViewModel<T> setModel(T model);
}
