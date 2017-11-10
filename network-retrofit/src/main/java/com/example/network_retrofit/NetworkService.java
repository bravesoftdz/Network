package com.example.network_retrofit;


import com.example.network_retrofit.data.request.BaseRequest;
import com.example.network_retrofit.data.request.TestRequest;
import com.example.network_retrofit.data.response.BaseResponse;
import com.example.network_retrofit.data.response.TestResponse;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by mamba on 25.09.2017.
 */

public interface NetworkService {
    @POST("/json/TestConnection")
    Call<TestResponse> testRequest(@Body TestRequest request);

    @POST("/json/Activation")
    Call<BaseResponse> activationRequest(@Body BaseRequest request);

    @GET("")
    Call<JsonObject> someRequest();


}
