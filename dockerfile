# Use official OpenJDK base image
FROM amazoncorretto:21

# Set working directory
WORKDIR .

EXPOSE 8090

# Copy the JAR file into the container
COPY out/artifacts/ManageLibrary_jar/ManageLibrary.jar app.jar

# (Optional) If using a Maven/Gradle project, build inside the container
# COPY . .
# RUN ./mvnw package -DskipTests

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
#  как докер должен запустить файл в терминале