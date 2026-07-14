package com.ayushi.weatherproxy.controller;

import com.ayushi.weatherproxy.dto.WeatherDTO;
import com.ayushi.weatherproxy.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/")
    public String home() {
        return "Weather API Proxy is Running!";
    }

    @GetMapping("/weather")
    public WeatherDTO getWeather(@RequestParam String city) {
        return weatherService.getWeather(city);
    }
}