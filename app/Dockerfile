FROM eclipse-temurin:17-jdk-alpine as build
WORKDIR /workspace/app
COPY build.gradle.kts build.gradle.kts
COPY gradlew gradlew
COPY gradle gradle
COPY src src
RUN ./gradlew build -x test
# RUN mkdir -p dependency && (cd dependency; jar -xf ../build/libs/app-0.0.1-SNAPSHOT.jar)

FROM eclipse-temurin:17-jdk-alpine
COPY --from=build /workspace/app/build/libs/app-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java", "-jar", "app.jar" ]

# FROM eclipse-temurin:17-jdk-alpine
# ARG DEPENDENCY=/workspace/app/dependency
# COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
# COPY --from=build ${DEPENDENCY}/META-INF /app/META-INF
# COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /app
# ENTRYPOINT ["java","-cp","app:app/lib/*","com.komt.app.AppApplication"]
