package com.codiodes.retrofitexample.entity;

import java.util.List;

/**
 * Created by Salman on 4/30/2016.
 */
public class ApiResponse {

    private List<User> results;

    public ApiResponse(List<User> results) {
        this.results = results;
    }

    public List<User> getResults() {
        return results;
    }
}
