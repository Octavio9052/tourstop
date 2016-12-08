package com.cetys.dreamteam.musicalbroccoli.infrastructure.networking.request;

/**
 * @Author J. Pichardo on 12/4/2016.
 */

public class Filter {

    //<editor-fold defaulstate="collapsed" desc="Instance Properties">
    private String propertyName;
    private String relationship;
    private String value;
    //</editor-fold>

    //<editor-fold desc="Property Accessors" defaultstate="collapsed">
    public String getPropertyName() {
        return propertyName;
    }

    public Filter setPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }

    public String getRelationship() {
        return relationship;
    }

    public Filter setRelationship(String relationship) {
        this.relationship = relationship;
        return this;
    }

    public String getValue() {
        return value;
    }

    public Filter setValue(String value) {
        this.value = value;
        return this;
    }
    //</editor-fold>

}
