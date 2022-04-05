FROM openjdk:11 AS builder
WORKDIR /app

COPY ./gradlew ./
COPY ./application.yaml ./
COPY settings.gradle.kts ./
COPY ./gradle ./gradle
COPY ./ ./
COPY build.gradle.kts ./
COPY ./docker-entrypoint.sh ./
RUN ./gradlew build

FROM openjdk:11 AS release

ARG module

COPY --from=builder /app/build/libs/*.jar /portfolio.jar
COPY docker-entrypoint.sh /
RUN chmod +x /docker-entrypoint.sh
ENTRYPOINT ["/docker-entrypoint.sh"]