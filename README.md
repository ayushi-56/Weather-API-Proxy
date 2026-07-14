
#  Weather API Proxy

## Overview

Weather API Proxy is a Spring Boot REST API that fetches real-time weather information from the OpenWeather API and returns a simplified JSON response.

---

## Features

- Get weather information by city name
- Fetch live weather from OpenWeather API
- Convert temperature from Kelvin to Celsius
- Return a clean JSON response using DTO
- Handle invalid city names gracefully
- RESTful API built using Spring Boot

---

## Technologies Used

- Java 17
- Spring Boot
- Maven
- RestTemplate
- OpenWeather API
- IntelliJ IDEA

---

## Project Structure

src/main/java/com/ayushi/weatherproxy

├── controller

├── service

├── model

├── dto

├── config

└── exception

---

## API Endpoints

### Home

GET /

Response

```
Weather API Proxy is Running!
```

---

### Get Weather

GET /weather?city=Delhi

Example Response

```json
{
  "city": "Delhi",
  "temperature": 38.93,
  "humidity": 32,
  "description": "overcast clouds"
}
```

---

### Invalid City

GET /weather?city=abcdxyz

Response

```json
{
  "status": 404,
  "message": "City not found"
}
```

---

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Add your OpenWeather API key in:

```
src/main/resources/application.properties
```

Example

```
weather.api.key=YOUR_API_KEY
```

4. Run the Spring Boot application.

5. Open

```
http://localhost:8080/weather?city=Delhi
```

---


=======
# Weather-API-Proxy
>>>>>>> 48241e7f4b3e22b48d4b949945fada71461df401
