package com.codiodes.retrofitexample.api;

import com.codiodes.retrofitexample.entity.ApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Salman on 4/30/2016.
 */
public interface UserApi {

    public static final String API_ENDPOINT = "https://randomuser.me/";

    @GET("api/")
    Call<ApiResponse> getUsers(@Query("nat") String nationality);

}
