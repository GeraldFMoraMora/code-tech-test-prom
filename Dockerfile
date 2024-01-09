FROM openjdk:17
VOLUME /tmp
EXPOSE 8081
ARG JAR_FILE=target/code-tech-test-prom.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]