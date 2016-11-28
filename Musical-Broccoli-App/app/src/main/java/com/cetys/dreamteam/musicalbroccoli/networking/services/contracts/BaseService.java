package com.cetys.dreamteam.musicalbroccoli.networking.services.contracts;

import android.databinding.ObservableArrayList;

import com.cetys.dreamteam.musicalbroccoli.commons.dtos.BaseDto;

/**
 * @Author J. Pichardo on 11/28/2016.
 */

public interface BaseService< TDto extends BaseDto > {

    boolean create( TDto dto );

    boolean update( int position, TDto dto );

    TDto getById( int id );

    ObservableArrayList< TDto > getAll();

    boolean delete( int id );

}
