package com.example.network_retrofit.data.network.miscellaneous.holder;

/**
 * Created by mamba on 02.10.2017.
 */

public class LanguageInformationHolder {
    private String language;

    private static LanguageInformationHolder instance;

    public static synchronized LanguageInformationHolder getInstance() {
        if (instance == null) {
            throw new IllegalStateException("Language information holder has not been initialized!");
        }
        return instance;
    }

    public static synchronized void init(String language) {
        instance = new LanguageInformationHolder(language);
    }

    private LanguageInformationHolder(String language) {
        this.language = language;
    }

    public synchronized void setLanguage(String language) {
        this.language = language;
    }

    public synchronized String getLanguage() {
        return language;
    }
}
