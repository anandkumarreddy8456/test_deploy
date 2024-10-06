# Use a base image with Java
FROM openjdk:17-jdk-slim

# Copy the JAR file to the container
COPY target/demo-0.0.1-SNAPSHOT.jar /app.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/app.jar"]
