# Kafka Producer-Consumer Demo

Este proyecto muestra cómo integrar **Spring Boot** con **Apache Kafka** para crear un productor y un consumidor de mensajes. Se incluye la creación de un tópico Kafka, el envío de mensajes desde un productor y su recepción a través de un consumidor.

---

## Requisitos Previos

- **Java 17+**
- **Apache Kafka** instalado y en ejecución
- **Spring Boot** configurado
- **Docker** (opcional para ejecutar Kafka)

---

## Pasos para Ejecutar

1. **Configura el Servidor Kafka**  
   Asegúrate de que Kafka esté en ejecución. Por defecto, este proyecto usa `localhost:9092`.

2. **Crea el Proyecto Spring Boot**  
   Incluye las dependencias necesarias para Kafka en `pom.xml` o `build.gradle`:
   ```xml
   <dependency>
       <groupId>org.springframework.kafka</groupId>
       <artifactId>spring-kafka</artifactId>
   </dependency>

3. **Configura el Tópico**
El tópico helloFromJava-Topic se crea automáticamente al iniciar la aplicación con las siguientes características:

* Particiones: 2
* Replicas: 2
* Tiempo de Retención: 24 horas
* Ejecuta el Productor y el Consumidor

4. **Ejecuta el Productor y el Consumidor**

* Al iniciar la aplicación, el productor enviará un mensaje al tópico.
* El consumidor escuchará el mensaje y lo imprimirá en la consola.

---

## Resultados Esperados
1. **Lista de Tópicos**
Evidencia del tópico creado exitosamente en Kafka:
![topic list](https://github.com/user-attachments/assets/589d53d5-e536-45d7-b951-f3f387b9d9e5)


2. **Mensaje Publicado en Kafka**
Salida del mensaje en la terminal de Kafka al usar el productor:
![message](https://github.com/user-attachments/assets/9ed8f146-b748-49bb-8d9f-4c650e170ad5)


3. **Mensaje Recibido por el Listener**
Evidencia del mensaje procesado por el consumidor en la consola de Spring Boot:
![final test](https://github.com/user-attachments/assets/f4b26cf1-acae-4403-bce0-edac1e8e3d20)

---

## Autor
**Anuar Avalos Orozco**

Proyecto desarrollado como parte del programa de Ingeniería de Software y Redesde la 
**Universidad del Valle de México (UVM).**
