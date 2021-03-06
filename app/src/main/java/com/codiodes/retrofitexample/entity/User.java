package com.codiodes.retrofitexample.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Salman on 4/30/2016.
 */
public class User {

    @SerializedName("gender")
    private String gender;

    @SerializedName("name")
    private Name name;

    @SerializedName("location")
    private Location location;

    @SerializedName("email")
    private String email;

    @SerializedName("cell")
    private String cell;

    @SerializedName("nat")
    private String nat;

    public User(String gender, Name name, Location location, String email, String cell, String nat) {
        this.gender = gender;
        this.name = name;
        this.location = location;
        this.email = email;
        this.cell = cell;
        this.nat = nat;
    }

    public String getGender() {
        return gender;
    }

    public Name getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }

    public String getCell() {
        return cell;
    }

    public String getNat() {
        return nat;
    }
}
