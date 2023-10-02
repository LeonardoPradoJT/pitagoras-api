package com.example.vertopalapi.service;

import com.example.vertopalapi.config.VertopalApiConfig;
import com.example.vertopalapi.model.VertopalApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class VertopalApiService {

    @Autowired
    private VertopalApiConfig vertapalApiConfig;

    public VertopalApiResponse getVertopalApiResponse() {
        HttpEntity<Void> requestEntity = new HttpEntity<>(Void.class);
        ResponseEntity<VertopalApiResponse> responseEntity = vertapalApiConfig.vertopalApiRestTemplate().exchange("https://vertopal.example.com/api/v1/get", HttpMethod.GET, requestEntity, VertopalApiResponse.class);
        return responseEntity.getBody();
    }
}
