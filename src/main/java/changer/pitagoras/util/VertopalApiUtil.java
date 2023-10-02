package com.example.vertopalapi.util;

import com.example.vertopalapi.model.VertopalApiResponse;

public class VertopalApiUtil {

    public static void printVertopalApiResponse(VertopalApiResponse vertapalApiResponse) {
        System.out.println("Vertopal API Response:");
        System.out.println("Message: " + vertapalApiResponse.getMessage());
    }
}
