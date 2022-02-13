FROM openjdk:11 AS builder
WORKDIR /app

ARG module

COPY ./gradlew ./
COPY ./settings.gradle ./
COPY ./gradle ./gradle
COPY ./$module ./
COPY ./$module/build.gradle ./
COPY ./docker-entrypoint.sh ./
RUN ./gradlew build
#RUN ./gradlew bootRun

FROM openjdk:11 AS release

ARG module

COPY --from=builder /app/build/libs/*.jar /build/portfolio.jar
#COPY docker-entrypoint.sh /usr/local/bin/
COPY docker-entrypoint.sh /build/
#RUN chmod +x /usr/local/bin/docker-entrypoint.sh
RUN chmod +x /build/docker-entrypoint.sh
ENTRYPOINT ["/build/docker-entrypoint.sh"]