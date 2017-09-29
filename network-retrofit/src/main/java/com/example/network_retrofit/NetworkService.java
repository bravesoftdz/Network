package com.example.network_retrofit;


import com.example.network_retrofit.data.request.TestRequest;
import com.example.network_retrofit.data.response.TestResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by mamba on 25.09.2017.
 */

public interface NetworkService {
    @POST("/json/TestConnection")
    Call<TestResponse> testRequest(@Body TestRequest request);
}
