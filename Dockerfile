FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY . .

RUN ./mvnw clean package -DskipTests

CMD ["java", "-Dserver.port=${PORT:-8080}", "-jar", "target/email-writer-sb-0.0.1-SNAPSHOT.jar"]
