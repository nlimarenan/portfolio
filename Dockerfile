FROM openjdk:11 AS builder
WORKDIR /app

ARG module

COPY ./gradlew ./
COPY ./application.properties ./
COPY ./settings.gradle ./
COPY ./gradle ./gradle
COPY ./$module ./
COPY ./$module/build.gradle ./
COPY ./docker-entrypoint.sh ./
RUN ./gradlew build

FROM openjdk:11 AS release

ARG module

COPY --from=builder /app/build/libs/*.jar /portfolio.jar
COPY docker-entrypoint.sh /
RUN chmod +x /docker-entrypoint.sh
ENTRYPOINT ["/docker-entrypoint.sh"]