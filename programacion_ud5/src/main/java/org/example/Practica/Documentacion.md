# Práctica 1. Práctica de

## ÍNDICE 
1. [Intro](https://github.com/adrigeada/programacion_ud5/edit/main/programacion_ud5/src/main/java/org/example/Practica/Documentacion.md#1-intro)
2. [Estructura de clases](#2-estructura-de-clases)
    - Diagrama de clases UML
    - Código de PlantUML
    - Contenido de las clases .java
3. [Programa principal (app)](#3-programa-principal-app)
4. [Pruebas](#4-pruebas)
5. [Entrega](#5-entrega)

### 1. Intro
> La práctica consiste en una app para crear cadenas de televisión, programas, empleados de los programas y los invitados que irán a estos programas.
> Un programa pertenece a una cadena y una cadena puede tener muchos programas. Los programas tienen empleados e invitados. De los empleados, uno es el director del programa.<br>
> Esta app aplica unos métodos:
> - Para poder elegir la fecha en la que un invitado acudirá al programa.
> - Para ver cuantos invitados han acudido en una temporada dada, de un programa.
> - Cuantas veces ha ido un invitado a una temporada, dado el nombre del invitado.
> - Mostrar que días ha ido el invitado al programa.
> - Saber si un invitado ha estado en un programa.
> - Dado el nombre del invitado y dos programas, saber a que programa fue antes. 

### 2. Estructura de clases

#### Diagrama de clases UML
![](img/Practica.png)

#### Código de PlantUML

````
@startuml

package "org.example.Biblioteca" {

    class Editorial {
        - nombre : String
        - pais : String
        - librosEditorial : ArrayList<Libro>

        + Editorial(nombre : String, pais : String)
        + Editorial()
        + insertarLibro(libro : Libro) : void
        + borrarLibro(libro : Libro) : void
        + getLibrosEditorial() : ArrayList<Libro>
        + setLibrosEditorial(librosEditorial : ArrayList<Libro>) : void
        + getNombre() : String
        + setNombre(nombre : String) : void
        + getPais() : String
        + setPais(pais : String) : void
        + toString() : String
    }

    class Estudiante {
        - CORREO_FORMAT : String
        - contadorEstudiantes : int
        - nombre : String
        - curso : String
        - nia : int
        - email : String
        - listaLibros : ArrayList<Libro>

        + Estudiante(nombre : String, curso : String, email : String)
        + Estudiante(nombre : String)
        + obtenerTotalEstudiantes() : int
        + validarCorreo(correo : String) : boolean
        + insertarLibro(libro : Libro) : void
        + borrarLibro(libro : Libro) : void
        + getNombre() : String
        + setNombre(nombre : String) : void
        + getCurso() : String
        + setCurso(curso : String) : void
        + getNia() : int
        - setNia() : void
        + getEmail() : String
        + setEmail(email : String) : void
        + getListaLibros() : ArrayList<Libro>
        + toString() : String
    }

    class Libro {
        - cantidadLibros : int
        - librosDisponibles : int
        - CADENA_ID : String
        - titulo : String
        - autor : String
        - id : String
        - disponible : boolean
        - estudiantePrestado : Estudiante
        - editorial : Editorial

        + Libro(titulo : String, autor : String, editorial : Editorial)
        - calcularID() : String
        + prestar(estudiante : Estudiante) : Prestamo
        + devolver() : void
        + estaDisponible() : boolean
        + getTotalLibros() : int
        + getLibrosDisponibles() : int
        + getTitulo() : String
        + setTitulo(titulo : String) : void
        + getAutor() : String
        + setAutor(autor : String) : void
        + getId() : String
        + isDisponible() : boolean
        + setDisponible(disponible : boolean) : void
        + getEstudiantePrestado() : Estudiante
        + getEditorial() : Editorial
        + setEditorial(editorial : Editorial) : void
        + toString() : String
    }

    class Prestamo {
        - libro : Libro
        - estudiante : Estudiante
        - fecha : LocalDateTime

        + Prestamo(libro : Libro, estudiante : Estudiante)
        + getLibro() : Libro
        + setLibro(libro : Libro) : void
        + getFecha() : LocalDateTime
        + setFecha(fecha : LocalDateTime) : void
        + getEstudiante() : Estudiante
        + setEstudiante(estudiante : Estudiante) : void
        + toString() : String
    }

    ' Relaciones
    Estudiante "1" -- "*" Libro : presta >
    Libro "*" -- "1" Editorial : pertenece a >
    Prestamo "1" o--> "1" Libro
    Prestamo "1" o--> "1" Estudiante

@enduml

````

#### Contenido de las clases (.java)
- Clase Casa.java
````
codigo
````
[Link a la clase en github]()

### 3. Programa principal (app)

### 4. Pruebas

### 5. Entrega

- [X] Código fuente en GitHub
- [ ] Documentación
