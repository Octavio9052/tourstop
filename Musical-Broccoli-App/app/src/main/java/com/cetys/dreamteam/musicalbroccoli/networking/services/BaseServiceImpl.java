package com.cetys.dreamteam.musicalbroccoli.networking.services;

import android.databinding.ObservableArrayList;

import com.cetys.dreamteam.musicalbroccoli.commons.dtos.BaseDto;
import com.cetys.dreamteam.musicalbroccoli.networking.services.contracts.BaseService;

/**
 * @Author J. Pichardo on 11/28/2016.
 */

public class BaseServiceImpl< TDto extends BaseDto > implements BaseService< TDto > {

    protected ObservableArrayList< TDto > dtos;

    public BaseServiceImpl() {
        dtos = new ObservableArrayList<>();
    }


    @Override
    public boolean create( TDto dto ) {
        boolean result = true;

        try {
            dtos.add( dto );
        } catch ( Exception ex ) {
            result = false;
        }

        return result;
    }

    @Override
    public boolean update( int position, TDto dto ) {
        boolean result = true;

        try {
            dtos.remove( position );
            dtos.add( position, dto );
        } catch ( Exception ex ) {
            result = false;
        }

        return result;
    }

    @Override
    public boolean delete( int id ) {
        boolean result = true;

        try {
            dtos.remove( id );
        } catch ( Exception ex ) {
            result = false;
        }

        return result;
    }

    @Override
    public TDto getById( int id ) {
        return dtos.get( id );
    }

    @Override
    public ObservableArrayList< TDto > getAll() {
        return dtos;
    }


}
