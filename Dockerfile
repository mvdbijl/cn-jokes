FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY clrrsnd-0.0.1-SNAPSHOT.war app.war
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.war"]