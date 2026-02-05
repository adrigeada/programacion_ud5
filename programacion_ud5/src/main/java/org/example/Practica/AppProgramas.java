package org.example.Practica;

public class AppProgramas {
    static void main() {

        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);
        Programa hormiguero = new Programa("Hormiguero",antena3,"Director1");
        Programa revuelta = new Programa("Revuelta",antena3,"Ricardo");
        System.out.println(hormiguero);
        System.out.println(antena3);

        hormiguero.anyadirEmpleado("Pablito","presentador",null);
        hormiguero.anyadirEmpleado("Paco","director",null);
        hormiguero.anyadirEmpleado("Vicen","caca",null);
        System.out.println(hormiguero);

       hormiguero.anyadirInvitado("Aitana","Cantante",1);
       hormiguero.anyadirInvitado("Aitana","Comico",2);
       hormiguero.anyadirInvitado("Broncano","payaso", 1);
       revuelta.anyadirInvitado("Aitana","Cantante",1);

       hormiguero.invitadosTemporada(1);
       hormiguero.rastrearInvitado("Aitana");
       System.out.println(hormiguero.buscarInvitado("Broncano"));
       hormiguero.buscarInvitado("Patri");

       hormiguero.invAntes("Aitana",hormiguero,revuelta);

        System.out.println(hormiguero.getListaInvitados());


    }
}
