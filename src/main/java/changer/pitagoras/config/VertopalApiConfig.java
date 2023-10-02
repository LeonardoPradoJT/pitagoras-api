package com.example.vertopalapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class VertopalApiConfig {

    @Bean
    public RestTemplate vertapalApiRestTemplate() {
        return new RestTemplate();
    }
}
