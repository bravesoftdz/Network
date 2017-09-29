package com.example.mamba.network;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.network_retrofit.NetworkFactory;
import com.example.network_retrofit.NetworkService;
import com.example.network_retrofit.data.request.TestRequest;
import com.example.network_retrofit.data.response.TestResponse;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {
    public static final String SERVER = "http://217.174.185.218:36990";
    private static final String TEST_SERVER = "http://10.31.0.40:5005";
    NetworkService networkService = NetworkFactory.getNetworkFactory(SERVER);
    NetworkService testNetworkService = NetworkFactory.getNetworkFactory(TEST_SERVER);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        networkService
                .testRequest(new TestRequest("string","string","string"))
                .enqueue(new Callback<TestResponse>() {
                    @Override
                    public void onResponse(Call<TestResponse> call, Response<TestResponse> response) {
                        Log.d("happy", new Gson().toJson(response));
                    }

                    @Override
                    public void onFailure(Call<TestResponse> call, Throwable t) {

                    }
                });
        testNetworkService
                .testRequest(new TestRequest("string1", "string2", "string3"))
                .enqueue(new Callback<TestResponse>() {
                    @Override
                    public void onResponse(Call<TestResponse> call, Response<TestResponse> response) {
                        Log.d("happy", response.body().toString());
                    }

                    @Override
                    public void onFailure(Call<TestResponse> call, Throwable t) {

                    }
                });

    }
}
