package com.cetys.dreamteam.musicalbroccoli.presentation.models;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

import com.cetys.dreamteam.musicalbroccoli.commons.enums.CountryCode;

/**
 * Created by Octavio on 2016/11/12.
 */
public class AddressModel extends BaseModel {

    //<editor-fold defaultstate="collapsed" desc="Instance Properties">
    private ObservableInt id;
    private ObservableField<String> name;
    private ObservableField<String> street1;
    private ObservableField<String> street2;
    private ObservableField<String> city;
    private ObservableField<String> state;
    private ObservableInt postalCode;
    private CountryCode countryCode;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Property Accessors">
    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        if (this.name == null)
            this.name = new ObservableField<>(name);
        else
            this.name.set(name);
    }

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        if (this.id == null)
            this.id = new ObservableInt(id);
        else
            this.id.set(id);
    }

    public String getStreet1() {
        return street1.get();
    }

    public void setStreet1(String street1) {
        if (this.street1 == null)
            this.street1 = new ObservableField<>(street1);
        else
            this.street1.set(street1);
    }

    public String getStreet2() {
        return street2.get();
    }

    public void setStreet2(String street2) {
        if (this.street2 == null)
            this.street2 = new ObservableField<>(street2);
        else
            this.street2.set(street2);
    }

    public String getCity() {
        return city.get();
    }

    public void setCity(String city) {
        if (this.city == null)
            this.city = new ObservableField<>(city);
        else
            this.city.set(city);
    }

    public String getState() {
        return state.get();
    }

    public void setState(String state) {
        if (this.state == null)
            this.state = new ObservableField<>(state);
        else
            this.state.set(state);
    }

    public int getPostalCode() {
        return postalCode.get();
    }

    public void setPostalCode(int postalCode) {
        if (this.postalCode == null)
            this.postalCode = new ObservableInt(postalCode);
        else
            this.postalCode.set(postalCode);
    }

    public CountryCode getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode;
    }
    //</editor-fold>
}
