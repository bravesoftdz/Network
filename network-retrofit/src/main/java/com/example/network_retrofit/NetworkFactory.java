package com.example.network_retrofit;

import android.content.Context;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by mamba on 25.09.2017.
 */

public class NetworkFactory {
    private static Retrofit retrofit;
    private static TrustManager[] trustManagers;
    private static SSLContext sslContext;

    public static NetworkService getSecureNetworkFactory(String baseUrl, Context context)
            throws CertificateException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException, IOException {

        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        InputStream certificateInputStream = context.getResources().openRawResource(context.getResources().openRawResource(R.raw.certificate));
        Certificate certificate = certificateFactory.generateCertificate(certificateInputStream);
        keyStore.setCertificateEntry("alias", certificate);
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        trustManagers = trustManagerFactory.getTrustManagers();
        sslContext  = SSLContext.getInstance("TLS");
        sslContext.init(null, trustManagers, null);

        OkHttpClient client = new OkHttpClient.Builder()
                .sslSocketFactory(sslContext.getSocketFactory(), (X509TrustManager) trustManagers[0])
                .build();

        retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseUrl)
                .client(client)
                .build();
        return retrofit.create(NetworkService.class);
    }

    public static NetworkService getNetworkFactory(String baseUrl){

    }
}
