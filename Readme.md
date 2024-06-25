

# Proyecto de Migración de Django a Spring Boot
## Tecnologías Utilizadas

- Spring Boot: Framework para el desarrollo de aplicaciones Java basadas en Spring.
- PostgreSQL: Sistema de gestión de bases de datos relacional utilizado para almacenar los datos de la aplicación.
- Gradle: Herramienta de automatización de compilación utilizada para gestionar las dependencias y la construcción del proyecto.
- Java: Lenguaje de programación utilizado para desarrollar la lógica de la aplicación.
- Javax: API utilizada para manejar las solicitudes y respuestas HTTP en la aplicación web.


Este proyecto tiene como objetivo migrar una aplicación web desarrollada originalmente en Django a Spring Boot. La migración incluye la reimplementación de todas las funcionalidades existentes en Django utilizando el framework de Spring Boot, así como la configuración de la base de datos y la integración de dependencias necesarias.

## Estructura del Proyecto

- **src/main/java/com/ProyModelodb/proymodelodb**: Contiene el código fuente de la aplicación Spring Boot.
  - **ProymodelodbApplication.java**: Clase principal que inicia la aplicación Spring Boot.
  - **Models/Usuario.java**: Clase de entidad que representa la tabla "usuario" en la base de datos.
- **src/main/resources**: Contiene los archivos de configuración de la aplicación.
  - **application.properties**: Archivo de configuración de Spring Boot.
- **build.gradle**: Archivo de configuración de Gradle para la gestión de dependencias y compilación del proyecto.

## Configuración de la Base de Datos

La aplicación utiliza PostgreSQL como base de datos. La configuración de la conexión a la base de datos se encuentra en el archivo `application.properties`:
