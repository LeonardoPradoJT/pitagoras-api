package com.example.vertopalapi.controller;

import com.example.vertopalapi.model.VertopalApiResponse;
import com.example.vertopalapi.service.VertopalApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org .springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VertopalApiController {

    @Autowired
    private VertopalApiService vertapalApiService;

    @GetMapping("/vertopal")
    public VertopalApiResponse getVertopalApiResponse() {
        return vertapalApiService.getVertopalApiResponse();
    }
}
