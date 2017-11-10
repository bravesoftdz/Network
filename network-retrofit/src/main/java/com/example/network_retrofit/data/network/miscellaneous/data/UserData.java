package com.example.network_retrofit.data.network.miscellaneous.data;

/**
 * Created by mamba on 02.10.2017.
 */

public class UserData {
    private final String title;
    private final String destination;

    public UserData(String title, String destination) {
        this.title = title;
        this.destination = destination;
    }

    public String getTitle() {
        return title;
    }

    public String getDestination() {
        return destination;
    }
}
