package org.example.Practica;

public class AppProgramas {
    static void main() {

        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);
    Programa hormiguero = new Programa("Hormiguero",antena3,"Director1");
        System.out.println(hormiguero);
        System.out.println(antena3);

        hormiguero.anyadirEmpleado("Pablito","presentador",null);
        hormiguero.anyadirEmpleado("Paco","director",null);
        System.out.println(hormiguero);




    }
}
