package com.codiodes.retrofitexample.api;

import com.codiodes.retrofitexample.entity.ApiResponse;


import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Salman on 4/30/2016.
 */
public class UserService {

    private UserApi mUserApi;

    public UserService() {

        // For logging request & response (Optional)
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(loggingInterceptor);

        Retrofit mRetrofit = new Retrofit.Builder()
                .baseUrl(UserApi.API_ENDPOINT)
                .client(httpClient.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        mUserApi = mRetrofit.create(UserApi.class);
    }

    public void getUsers(Callback<ApiResponse> apiResponseCallback) {
        Call<ApiResponse> call = mUserApi.getUsers("us");
        call.enqueue(apiResponseCallback);
    }
}
