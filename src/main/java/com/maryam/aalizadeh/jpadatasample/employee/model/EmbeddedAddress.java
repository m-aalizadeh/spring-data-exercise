package com.maryam.aalizadeh.jpadatasample.employee.model;

import jakarta.persistence.*;

@Embeddable
public class EmbeddedAddress {
    private String postcode;
    private String city;
    private String street;

    public EmbeddedAddress() {
    }

    public EmbeddedAddress(String postcode, String city, String street) {
        this.postcode = postcode;
        this.city = city;
        this.street = street;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "EmbeddedAddress{" +
                ", postcode='" + postcode + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
