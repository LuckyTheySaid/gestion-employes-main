FROM maven:3.8.4-openjdk-17 AS maven
WORKDIR /usr/src/app
COPY . /usr/src/app
RUN ["mvn", "package", "-Dmaven.test.skip=true"]

# For Java 17,
FROM openjdk:17-alpine
ARG JAR_FILE=target/*.jar
WORKDIR /opt/app
COPY --from=maven /usr/src/app/${JAR_FILE} /opt/app/app.jar
#ENTRYPOINT ["java","-Dspring.profiles.active=deploy","-jar","/opt/app/app.jar"]
ENTRYPOINT ["java","-jar","/opt/app/app.jar"]