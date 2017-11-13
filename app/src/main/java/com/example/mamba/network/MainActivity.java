package com.example.mamba.network;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.network_retrofit.NetworkFactory;
import com.example.network_retrofit.NetworkService;
import com.example.network_retrofit.TestRequest;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


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
                .testRequest(new TestRequest("message number", "phoneImei", "language"))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        testResponse -> {
                            Log.d("happy", testResponse.toString());
                        },
                        Throwable::printStackTrace,
                        () -> Log.d("happy", "completed!")
                );

    }
}
