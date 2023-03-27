FROM amazoncorretto:8-alpine-jdk
MAINTAINER LORENAB
COPY target/lorenab-0.0.1-SNAPSHOT.jar lorenab-app.jar
ENTRYPOINT  ["java","-jar","lorenab-app.jar"]
