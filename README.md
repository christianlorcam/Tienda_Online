# Tienda Online API

API REST desarrollada para la gestión de clientes y catálogo de productos, construida bajo una arquitectura por capas para asegurar un código limpio, escalable y mantenible.

## 📋 Descripción del Proyecto
Este proyecto es una versión inicial de una tienda online, enfocada en la administración de datos esenciales mediante servicios RESTful. El objetivo central es demostrar una organización robusta del código mediante la separación de responsabilidades entre el controlador, el servicio y la capa de acceso a datos.

## 🛠️ Tecnologías
* **Java 26**
* **Spring Boot (v4.1.0)**
* **Spring Data JPA / Hibernate**
* **PostgreSQL**
* **Maven**

## 🏗️ Arquitectura
El proyecto sigue una estructura de capas para mantener el código organizado:
* **Controller**: Exposición de endpoints y manejo de peticiones HTTP.
* **Service**: Lógica de negocio y procesamiento de datos.
* **Repository**: Acceso a datos mediante JPA.
* **DTO**: Objetos de transferencia de datos.
* **Mapper**: Conversión entre Entidades y DTOs.

## 🚀 Funcionalidades (CRUD)

### Clientes
* `POST /clientes`: Crear un nuevo cliente.
* `GET /clientes`: Listar todos los clientes.
* `GET /clientes/{id}`: Buscar cliente por ID.

### Productos
* `POST /productos`: Crear un producto.
* `GET /productos`: Listar productos.
* `GET /productos/{id}`: Buscar producto por ID.
* `DELETE /productos/{id}`: Eliminar producto.

## 💻 Instalación y Ejecución
1. Clona el repositorio.
2. Configura tu conexión a la base de datos PostgreSQL en `application.yml`.
3. Ejecuta el proyecto usando el Maven Wrapper desde la terminal en la raíz del proyecto:
   ```bash
   ./mvnw spring-boot:run

🤝 Autor

Desarrollado por Christian Lorca.
