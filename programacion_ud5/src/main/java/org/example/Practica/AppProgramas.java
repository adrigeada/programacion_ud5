package org.example.Practica;

import java.time.LocalDate;

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

       if (hormiguero.buscarInvitado("Aitana") && revuelta.buscarInvitado("Aitana")){
           hormiguero.invAntes("Aitana",hormiguero,revuelta);
       }



        System.out.println(hormiguero.getListaInvitados());

    }

    public void blabla (String nombre,Programa programa1, Programa programa2){

        LocalDate fecha1 = null;
        LocalDate fecha2 = null;

        for (Invitado invitado : programa1.getListaInvitados()){
            if (invitado.getNombre().equals(nombre)){
                fecha1 = invitado.getFechaVisita();
            }
        }

        for (Invitado invitado : programa2.getListaInvitados()){
            if (invitado.getNombre().equals(nombre)){
                fecha2 = invitado.getFechaVisita();
            }
        }

        if (fecha1.isBefore(fecha2)){
            System.out.println(nombre+" fue al programa "+programa1.getNombre()+" primero.");
        }else {
            System.out.println(nombre+" fue al programa "+programa2.getNombre()+ " primero.");
        }

    }
}
