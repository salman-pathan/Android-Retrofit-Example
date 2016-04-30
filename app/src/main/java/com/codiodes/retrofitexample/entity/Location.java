package com.codiodes.retrofitexample.entity;

/**
 * Created by Salman on 4/30/2016.
 */
public class Location {

    private String street;
    private String city;
    private String state;
    private int postcode;

    public Location(String street, String city, String state, int postcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getPostcode() {
        return postcode;
    }
}
