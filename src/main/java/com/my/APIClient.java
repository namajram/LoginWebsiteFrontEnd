package com.my;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class APIClient {

	 RestTemplate restTemplate = new RestTemplate();

    public void registerUser(Login user) {
        // Send a POST request to the API register endpoint
        restTemplate.postForObject("http://localhost:8082/register", user, Void.class);
    }

    public boolean loginUser(Login user) {
        // Send a POST request to the API login endpoint
        ResponseEntity<String> responseEntity = restTemplate.postForEntity("http://localhost:8082/signin", user, String.class);
        return responseEntity.getStatusCode() == HttpStatus.OK;
    }
}

