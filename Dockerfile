FROM openjdk:17
ADD target/spring-boot-rest-api-2.jar spring-boot-rest-api-2.jar
ENTRYPOINT ["java", "-jar","spring-boot-rest-api-2.jar"]
EXPOSE 8080