FROM amazoncorretto:22

COPY build/libs/demo-0.0.1-SNAPSHOT.jar app.jar

ENV TIMEZOME -Duser.timezone=Asia/Seoul
ENV MIN -XX:InitialRAMPercentage=25.0
ENV MAX -XX:MaxRAMPercentage=70.0

ENTRYPOINT ["sh", "-c", "java $TIMEZOME $MIN $MAX -jar /app.jar"]