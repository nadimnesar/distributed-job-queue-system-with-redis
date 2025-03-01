FROM openjdk:21-jdk-slim
WORKDIR /app

COPY ./target/worker-*.jar worker.jar

ENTRYPOINT ["java", "-jar", "worker.jar"]
