package com.example.network_retrofit;

import android.util.Log;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by mamba on 25.09.2017.
 */

public class NetworkFactory {
    private static Retrofit retrofit;
    private static TrustManager[] trustManagers;
    private static SSLContext sslContext;

    public static NetworkService getNetworkFactory(String baseUrl){

//        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
//        keyStore.load(null, null);
//        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
//        InputStream certificateInputStream = context.getResources().openRawResource(context.getResources().openRawResource(R.raw.certificate));
//        Certificate certificate = certificateFactory.generateCertificate(certificateInputStream);
//        keyStore.setCertificateEntry("alias", certificate);
//        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
//        trustManagerFactory.init(keyStore);
//        trustManagers = trustManagerFactory.getTrustManagers();
//        sslContext  = SSLContext.getInstance("TLS");
//        sslContext.init(null, trustManagers, null);
//
        OkHttpClient client = new OkHttpClient.Builder()
//                .sslSocketFactory(sslContext.getSocketFactory(), (X509TrustManager) trustManagers[0])
                .addInterceptor(new LoggingInterceptor())
                .build();

        retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(client)
                .build();
        return retrofit.create(NetworkService.class);
    }

    private static class LoggingInterceptor implements Interceptor{
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();

            long t1 = System.nanoTime();
            Log.d("happy", String.format("Sending request %s on %s%n%s%n%s",
                    request.url(), chain.connection(), request.headers(), request.toString()));

            Response response = chain.proceed(request);

            long t2 = System.nanoTime();
            Log.d("happy", String.format("Received response for %s in %.1fms%n%s%n%s",
                    response.request().url(), (t2 - t1) / 1e6d, response.headers(), response.toString()));

            return response;
        }
    }
}
