# 1. Schritt: Build-Umgebung mit Maven und Java 21 (oder 17, falls ihr ein älteres nutzt)
FROM maven:3.9.6-eclipse-temurin-21 AS build
COPY . .
RUN mvn clean package -DskipTests

# 2. Schritt: Schlankes Laufzeit-Image mit Java
FROM eclipse-temurin:21-jre-jammy
COPY --from=build /target/*.jar app.jar

# Port für Spring Boot öffnen
EXPOSE 8080

# App starten
ENTRYPOINT ["java", "-jar", "app.jar"]