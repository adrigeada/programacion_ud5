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

package "org.example.Practica" {

class Cadena {
    - nombre : String
    - listaProgramas : ArrayList<Programa>
    --
    + Cadena(nombre : String)
    + anyadirPrograma(programa : Programa) : void
    + mostrarListaProgramas() : void
}

class Programa {
    - nombre : String
    - cadena : Cadena
    - temporadas : int
    - listaEmpleados : ArrayList<Empleado>
    - listaInvitados : ArrayList<Invitado>
    - director : Empleado
    --
    + Programa(nombre : String, cadena : Cadena, nombre_director : String)
    + anyadirEmpleado(nombre : String, cargo : String, director : Empleado) : void
    + borrarEmpleado(empleado : Empleado) : void
    + anyadirInvitado(nombre : String, profesion : String, temporada : int) : void
    + borrarInvitado(invitado : Invitado) : void
    + invitadosTemporada(temporada : int) : void
    + vecesInvitado(nombre : String) : int
    + rastrearInvitado(nombre : String) : void
    + buscarInvitado(nombre : String) : boolean
}

class Empleado {
    - id : String
    - nombre : String
    - cargo : String
    - director : Empleado
    --
    + Empleado(nombre : String, cargo : String, director : Empleado)
    + asignarDirector(director : Empleado) : void
    + getCargo() : String
    + setCargo(cargo : String) : String
    + getDirector() : Empleado
    + setDirector(director : Empleado) : void
}

class Invitado {
    - nombre : String
    - profesion : String
    - fechaVisita : LocalDate
    - temporada : int
    --
    + Invitado(nombre : String, profesion : String, temporada : int)

}

Cadena "1" o-- "0..*" Programa : contiene
Programa "1" o-- "0..*" Empleado : emplea
Programa "1" o-- "0..*" Invitado : invita
Programa "1" --> "1" Empleado : director
Empleado "0..1" --> "1" Empleado : director

}

@enduml

````

#### Contenido de las clases (.java)
- Clase Cadena.java
````
codigo
````
[Link a la clase en github](https://github.com/adrigeada/programacion_ud5/blob/main/programacion_ud5/src/main/java/org/example/Practica/Cadena.java)

- Clase Empleado.java
````
codigo
````
[Link a la clase en github](https://github.com/adrigeada/programacion_ud5/blob/main/programacion_ud5/src/main/java/org/example/Practica/Empleado.java)

- Clase Invitado.java
````
codigo
````
[Link a la clase en github](https://github.com/adrigeada/programacion_ud5/blob/main/programacion_ud5/src/main/java/org/example/Practica/Invitado.java)

- Clase Programa.java
````
codigo
````
[Link a la clase en github](https://github.com/adrigeada/programacion_ud5/blob/main/programacion_ud5/src/main/java/org/example/Practica/Programa.java)


### 3. Programa principal (app)
````
codigo
````
[Link a la clase en github](https://github.com/adrigeada/programacion_ud5/blob/main/programacion_ud5/src/main/java/org/example/Practica/AppProgramas.java)

### 4. Pruebas

### 5. Entrega

- [X] Código fuente en GitHub
- [ ] Documentación
