package com.example.demo.service;

import org.springframework.stereotype.Component;

public class ChatClient {
    public ChatResponse prompt(String question) {
        return new ChatResponse(question);
    }
}

class ChatResponse {
    private final String content;

    public ChatResponse(String content) {
        this.content = content;
    }

    public String content() {
        return content;
    }
}

