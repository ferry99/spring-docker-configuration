# spring-docker-configuration
Spring boot app with external enviroment variables

# Step using docker run
- docker build -t bookstore:0.1 .
- docker run --name bookstore_api --network bookstore-net -e SPRING_PROFILES_ACTIVE=uat -e SPRING_DATASOURCE_URL=jdbc:postgresql://bookstore_db_uat:5432/postgres -p 8090:8083 bookstore:01

# Step using docker-compose 
- docker-compose up -d
