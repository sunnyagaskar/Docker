# Flightsapp 

This is a sample of a Spring Boot dockerized app. In order to run it, perform the following commands:

```docker build -t flightsapp .```


```docker run -p 8080:8080 --rm docker.io/library/flighsapp```

Check if it is working by hitting the following endpoint:

```curl http://localhost:8080/flights/ ```
