package com.example.network_retrofit;

import io.reactivex.Flowable;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by mamba on 25.09.2017.
 */

public interface NetworkService {
    @POST("/json/TestConnection")
    Flowable<TestResponse> testRequest(@Body TestRequest request);
}
