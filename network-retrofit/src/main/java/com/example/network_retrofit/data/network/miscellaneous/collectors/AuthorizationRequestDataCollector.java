package com.example.network_retrofit.data.network.miscellaneous.collectors;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mamba on 02.10.2017.
 */

public class AuthorizationRequestDataCollector {

    @Expose
    @SerializedName("OpLogin")
    protected String login;

    @Expose @SerializedName("OpPwd")
    protected String password;

    @Expose @SerializedName("Session")
    protected String session;

    @Expose @SerializedName("ExtToken")
    protected String token;

    protected AuthorizationRequestDataCollector() {
    }

    public AuthorizationRequestDataCollector(String login, String password, String session, String token) {
        this.login = login;
        this.password = password;
        this.session = session;
        this.token = token;
    }
}
