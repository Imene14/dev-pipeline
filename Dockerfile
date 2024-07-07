FROM openjdk:17-jdk

WORKDIR /app

COPY target/demo-1.0.0.jar /app/demo.jar

EXPOSE 8080

CMD ["java", "-jar", "springdemo.jar"]