package com.example.halukuyumsal.n11homework3;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.constraints.NotBlank;

@RestController
@RequestMapping("/api/weather")
@Validated
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/getWeather")
    public ResponseEntity<String> getWeather(
            @RequestParam @NotBlank(message = "Country cannot be blank") String country,
            @RequestParam @NotBlank(message = "City cannot be blank") String city) {
        return weatherService.getWeather(country, city);
    }
}