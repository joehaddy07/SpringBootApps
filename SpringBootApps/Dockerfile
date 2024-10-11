# Use official OpenJDK image as the base image
FROM openjdk:21

# Maintainer details
LABEL Maintainer="Joseph Haddison" \
      Email="joelhaddy07@gmail.com" \
      Team="SRE"

# Set working directory
WORKDIR /app

# Copy the JAR file (or the project directory) to the container
COPY target/SpringBoot.jar /app/SpringBoot.jar

# Expose the application port (optional, typically 8080 for Spring Boot apps)
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/SpringBoot.jar"]