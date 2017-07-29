# weatherApplication
Purpose of this application is Find the Maximum Temprature of Next 7 days for particular zip code location.

Developed the Solution using Spring Boot.
Used National Digital Forecast Database (NDFD) REST Web Service to get the data.
NDFD returns the reponse in XML Format and used SAX Parser to get temparatures of all 7 days.

Run this as spring boot Application

http://localhost:9999/weather/forecastMaxTemp?zipCodeList=73135

you can test this application in postman or any rest client with the above url and you can change the zip code as u want
