FROM maven:3.8.5-openjdk-17-slim

WORKDIR /app

COPY api-rest/pom.xml .
COPY api-rest/src ./src

# Aggiungo la configurazione per Java 17
ENV JAVA_OPTS="-Xmx512m -Xms256m"
ENV MAVEN_OPTS="-Dmaven.compiler.source=17 -Dmaven.compiler.target=17"

#RUN mvn clean package -DskipTests

EXPOSE 8080

VOLUME /app

CMD ["mvn", "spring-boot:run"] 