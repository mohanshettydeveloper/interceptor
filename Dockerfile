FROM openjdk:17
EXPOSE 8080
ADD target/interceptor-0.0.1-SNAPSHOT.jar interceptor-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/interceptor-0.0.1-SNAPSHOT.jar"]
