package com.my;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class APIClient {

	RestTemplate restTemplate = new RestTemplate();

	public void registerUser(Login user) {
		
		HttpEntity<Login> request = new HttpEntity<>(user);
		ResponseEntity<String> responseEntity = restTemplate.postForEntity("http://localhost:8082/register", request, String.class);
	}

	public boolean loginUser(Login user) {
		
		HttpEntity<Login> request = new HttpEntity<>(user);
		ResponseEntity<String> responseEntity = restTemplate.postForEntity("http://localhost:8082/signin", request,
				String.class);
		return responseEntity.getStatusCode() == HttpStatus.OK;
	}
}
