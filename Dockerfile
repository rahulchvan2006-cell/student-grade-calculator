FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY target/student-grade-calculator-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-cp", "app.jar", "com.example.student_grade_calculator.App"]
