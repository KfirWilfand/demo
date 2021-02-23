FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.war
COPY ${JAR_FILE} app.war
CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=test", "/app.war"]