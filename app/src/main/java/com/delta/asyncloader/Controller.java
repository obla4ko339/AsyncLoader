package com.delta.asyncloader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by GrabVN_1791 on 22.10.2017.
 */

public class Controller {
    final static String BASE_URL = "http://kultura-to.ru/";

    public static UmoriliApi getApi(){
        Gson json = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit  = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(json))
                .build();

        UmoriliApi umoriliApi = retrofit.create(UmoriliApi.class);
        return umoriliApi;
    }
}
