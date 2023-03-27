FROM amazoncorretto:8-alpine-jdk
MAINTAINER LORENAB
COPY target\lorenab-0.0.1-SNAPSHOT.jar
EXPOSE 808
ENTRYPOINT  ["java","-jar","nga-app.jar"]
