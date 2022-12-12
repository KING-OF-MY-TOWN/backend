./app/gradlew build -p app -x test
docker build --build-arg JAR_FILE=build/libs/app-0.0.1-SNAPSHOT.jar -t komtserver ./app