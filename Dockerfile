
#требует файл и не находит
#FROM eclipse-temurin:17-jdk-alpine
#VOLUME /tmp
#ARG JAR_FILE=build/libs/*jar
#COPY ${JAR_FILE} app.jar
#CMD ["sh", "-c", "java ${JAVA_OPTS} -jar /app.jar ${0} ${@}"]


#требует файл главный и не назодит
#FROM openjdk:17.0.1
#COPY src/ /src/
#RUN javac /src/com/example/effectiveMoblile/EffectiveMoblile.java -d /app
#WORKDIR /app
#CMD ["java", "com.example.effectiveMoblile.EffectiveMoblile"]

FROM openjdk:17-alpine3.14

EXPOSE 8080

RUN mkdir /app

COPY build/libs/*.jar /app/spring-boot-application.jar

ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/spring-boot-application.jar"]