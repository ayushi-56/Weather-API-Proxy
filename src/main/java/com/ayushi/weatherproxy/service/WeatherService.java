package com.ayushi.weatherproxy.service;

import com.ayushi.weatherproxy.dto.WeatherDTO;
import com.ayushi.weatherproxy.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private final RestTemplate restTemplate;

    @Value("${weather.api.key}")
    private String apiKey;

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherDTO getWeather(String city) {

        String url = "https://api.openweathermap.org/data/2.5/weather?q="
                + city
                + "&appid="
                + apiKey;

        WeatherResponse response =
                restTemplate.getForObject(url, WeatherResponse.class);

        double temperature = response.getMain().getTemp() - 273.15;

        return new WeatherDTO(
                response.getName(),
                Math.round(temperature * 100.0) / 100.0,
                response.getMain().getHumidity(),
                response.getWeather().get(0).getDescription()
        );
    }
}