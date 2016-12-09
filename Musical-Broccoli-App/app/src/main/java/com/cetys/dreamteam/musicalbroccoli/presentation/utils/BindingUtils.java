package com.cetys.dreamteam.musicalbroccoli.presentation.utils;

import android.databinding.BindingAdapter;
import android.databinding.InverseBindingAdapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

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

    @BindingAdapter("app:error")
    public static void BindError(EditText view, String error) {
        view.setError(error);
    }

    @InverseBindingAdapter(attribute = "android:text")
    public static int getIntFromText(TextView view) {
        return Integer.parseInt(view.getText().toString());
    }

    @InverseBindingAdapter(attribute = "android:text")
    public static float getFloatFromText(TextView view) {
        return Float.parseFloat(view.getText().toString());
    }

    @InverseBindingAdapter(attribute = "android:text")
    public static double getDoubleFromText(TextView view) {
        return Double.parseDouble(view.getText().toString());
    }
}
