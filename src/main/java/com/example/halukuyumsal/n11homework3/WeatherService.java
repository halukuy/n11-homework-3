package com.example.halukuyumsal.n11homework3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private final String apiKey;
    private final String apiUrl;

    public WeatherService(@Value("${weather.api.key}") String apiKey,
                          @Value("${weather.api.url}") String apiUrl) {
        this.apiKey = apiKey;
        this.apiUrl = apiUrl;
    }

    public ResponseEntity<String> getWeather(String country, String city) {

        String url = String.format("%s?q=%s,%s&key=%s", apiUrl, city, country, apiKey);

        try {
            ResponseEntity<String> response = new RestTemplate().getForEntity(url, String.class);
            return response;
        } catch (Exception e) {
            throw new WeatherServiceException("Weather service error", e);
        }
    }
}