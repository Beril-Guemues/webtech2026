# 1. Schritt: Build-Umgebung mit Gradle und Java 21
FROM eclipse-temurin:21-jdk AS build
WORKDIR /app
COPY . .
RUN chmod +x gradlew
RUN ./gradlew bootJar -x test

# 2. Schritt: Schlankes Laufzeit-Image mit Java
FROM eclipse-temurin:21-jre-jammy
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar

# Port für Spring Boot öffnen
EXPOSE 8080

# App starten
ENTRYPOINT ["java", "-jar", "app.jar"]