FROM openjdk:8

MAINTAINER 345249961@qq.com

COPY target/*.jar /app.jar

EXPOSE 8812

ENTRYPOINT ["java","-jar","/app.jar"]
