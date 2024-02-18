FROM openjdk:11

WORKDIR /app

COPY target/Calculator-1.0-SNAPSHOT.jar /app/calculator.jar