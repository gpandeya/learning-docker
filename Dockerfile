FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/hello-world-0.0.1-SNAPSHOT.jar hello-world.jar
ENTRYPOINT ["sh","-c","java -jar /hello-world.jar"]
