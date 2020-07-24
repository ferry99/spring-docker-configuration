FROM openjdk:11-jdk-slim AS jdk

# Refer to Maven build -> finalName
ARG JAR_FILE=target/test-0.0.1-SNAPSHOT.jar

# cd /opt/app
# WORKDIR /opt/app

# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} /

#Documentation Purpose Only
EXPOSE 8083

## java -jar /opt/app/app.jar
## necessary when not using docker compose
# ENTRYPOINT ["java","-jar","test-0.0.1-SNAPSHOT.jar"]

# Overide application.properties profiles With Dockerfile Commandline
# ENTRYPOINT ["java","-jar","test-0.0.1-SNAPSHOT.jar","--spring.profiles.active=uat","--spring.datasource.url=jdbc:postgresql://bookstore_db_uat:5432/postgres","--spring.datasource.password=654321"]


##HOW TO RUN VIA ENVIROMENT VAR
# docker run --name bookstore_api --network bookstore-net -e SPRING_PROFILES_ACTIVE=uat -e SPRING_DATASOURCE_URL=jdbc:postgresql://bookstore_db_uat:5432/postgres -p 8090:8083 bookstore:01