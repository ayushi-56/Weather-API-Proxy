
Name: AYUSHI KUSHWAHA

ID:CITS6702

Company: CODTECH IT SOLUTIONS

Domain: Backend Web Development

Duration: July to August 2026

Mentor: NEELA SANTHOSH KUMAR

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




## Screenshots

### Home Endpoint

<img width="719" height="686" alt="Screenshot 2026-07-14 at 1 32 59 PM" src="https://github.com/user-attachments/assets/33c3646b-a6bd-4e3e-b87e-67820af1b23c" />


### Weather API Response

<img width="710" height="612" alt="Screenshot 2026-07-14 at 1 44 38 PM" src="https://github.com/user-attachments/assets/bdd7f803-cb03-4df0-83c7-670ce10d9456" />


### Invalid City Response

<img width="712" height="617" alt="Screenshot 2026-07-14 at 1 46 38 PM" src="https://github.com/user-attachments/assets/1d021c06-162a-45bb-8419-cb055b97c5dc" />



