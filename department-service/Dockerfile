FROM openjdk:16-alpine
ARG JAR_FILE=targert/*.jar
COPY ${JAR_FILE} department-serive.jar
ENTRYPOINT [ "java", "-jar", "/department-service.jar" ]
EXPOSE 9001