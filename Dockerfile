FROM openjdk:17-jdk

WORKDIR /app

COPY target/demo.jar /app/demo.jar

EXPOSE 8080

CMD ["java", "-jar", "demo.jar"]