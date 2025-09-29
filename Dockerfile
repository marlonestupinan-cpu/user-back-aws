# Usa una imagen base con una versión específica de Java
FROM openjdk:17-jdk-slim

# Argumento para la ruta del archivo JAR
ARG JAR_FILE=build/libs/*.jar

# Copia el archivo JAR de tu proyecto a la imagen
COPY ${JAR_FILE} app.jar

# Expone el puerto en el que corre tu aplicación Spring Boot
EXPOSE 8080

# Comando para ejecutar la aplicación cuando el contenedor se inicie
ENTRYPOINT ["java","-jar","/app.jar"]