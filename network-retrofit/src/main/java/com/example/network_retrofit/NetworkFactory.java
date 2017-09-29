package com.example.network_retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by mamba on 25.09.2017.
 */

public class NetworkFactory {

    public static NetworkService getNetworkFactory(String baseUrl){
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseUrl)
                .build();
        return retrofit.create(NetworkService.class);
    }

}
