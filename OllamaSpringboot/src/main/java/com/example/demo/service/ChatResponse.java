package com.example.demo.service;

public class ChatResponse {
    private final String content;

    public ChatResponse(String content) {
        this.content = content;
    }

    public ChatResponse call() {
        return this;
    }

    public String content() {
        return content;
    }
}

