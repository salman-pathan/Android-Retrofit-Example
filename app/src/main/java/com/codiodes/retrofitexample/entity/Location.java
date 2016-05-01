package com.codiodes.retrofitexample.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Salman on 4/30/2016.
 */
public class Location {

    @SerializedName("street")
    private String street;

    @SerializedName("city")
    private String city;

    @SerializedName("state")
    private String state;

    @SerializedName("postcode")
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
