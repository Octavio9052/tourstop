package com.cetys.dreamteam.musicalbroccoli.presentation.utils;

import android.databinding.BindingAdapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.List;

/**
 * @Author J. Pichardo on 12/5/2016.
 */
public class BindingUtils {

    @BindingAdapter("app:items")
    public static <T> void BindItems(Spinner spinner, List<T> items) {
        spinner.setAdapter(new ArrayAdapter<T>(spinner
                .getContext(), android.R.layout.simple_spinner_item, items));
    }
}
