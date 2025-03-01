FROM openjdk:21-jdk-slim
WORKDIR /app

COPY ./target/producer-*.jar producer.jar

ENTRYPOINT ["java", "-jar", "producer.jar"]
