package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AiServiceImpl implements AiService {

    private final ChatClient client;

    @Autowired
    public AiServiceImpl(ChatClient.Builder builder) {
        this.client = builder.build();
    }

    @Override
    public String askAi(String question) {
        return client.prompt(question);  // No need for .call().content()
    }
        
        @Override
        public String askAi(String question) {
            return client.prompt(question).content();  // Removed .call()
        }
        @Override
        public String askAi(String question) {
            return client.prompt(question).call();  // Removed .content()
        }

}

