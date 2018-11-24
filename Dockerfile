FROM openjdk:8-jre-alpine

ARG JAR_FILE

RUN mkdir /application

COPY ${JAR_FILE} /application/app.jar

WORKDIR /application

CMD java -jar app.jar