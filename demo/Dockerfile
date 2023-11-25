FROM openjdk:17-oracle
ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} backend-app.jar
ENTRYPOINT ["java","-jar","/backend-app.jar"]
EXPOSE 8080
