package org.avillanova.example.websites.config;

public enum Urls {
    LOGIN_URL("https://trello.com/login");

    private String url;

    Urls(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
