# Use OpenJDK 11 as base image
FROM openjdk:11

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file into the container at /app
COPY target/SimpleApplication-0.0.1-SNAPSHOT.jar /app

# Expose the port that the application runs on
EXPOSE 8099

# Define the command to run your application
CMD ["java", "-jar", "SimpleApplication-0.0.1-SNAPSHOT.jar"]
