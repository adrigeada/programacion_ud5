package org.example.Practica;

import java.time.LocalDate;
import java.util.ArrayList;

public class Programa {
    private static final String CARGO_DIRECTOR = "director";

    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre,Cadena cadena,String nombre_director){
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0;
        listaEmpleados = new ArrayList<>();
        listaInvitados = new ArrayList<>();
        setDirector(nombre_director);
        cadena.anyadirPrograma(this);
    }


    //------------------------------------------------

    public void anyadirEmpleado(String nombre, String cargo,Empleado director){
        Empleado empleado = new Empleado(nombre,cargo,getDirector());
        if (cargo.equals(CARGO_DIRECTOR)){
            System.out.println("El programa ya tiene director.");
            return;
        }else {
            this.director = director;
        }

        listaEmpleados.add(empleado);
    }

    public void borrarEmpleado(Empleado empleado){
        listaEmpleados.remove(empleado);
    }

    public void anyadirInvitado(String nombre,String profesion,int temporada){
        Invitado invitado = new Invitado(nombre,profesion,temporada);
        listaInvitados.add(invitado);
    }

    public void borrarInvitado(Invitado invitado){
        listaInvitados.remove(invitado);
    }

    public void invitadosTemporada(int temporada){
        int contador = 0;

        for (Invitado invitado : listaInvitados){
            if (invitado.getTemporada() == temporada){
                contador++;
                System.out.println("El invitado "+invitado.getNombre()+ " que es "+invitado.getProfesion()+" fue en la temporada "+temporada);
            }
        }

        System.out.println(contador+" Invitados han ido en la temporada "+temporada );

    }

    public int vecesInvitado(String nombre){
        int contador = 0;

        for (Invitado invitado : listaInvitados){
            if (invitado.getNombre().equals(nombre)){
                contador++;
            }
        }
        return contador;
    }

    public void rastrearInvitado(String nombre){
        int veces = vecesInvitado(nombre);
        System.out.println("El invitado "+nombre+" ha ido "+veces+" veces al programa "+this.nombre);

        for (Invitado invitado : listaInvitados){
            if (invitado.getNombre().equals(nombre)){
                System.out.println("- El día "+invitado.getFechaVisita()+", en la temporada "+invitado.getTemporada());
            }

        }
    }

    public boolean buscarInvitado(String nombre){
        for (Invitado invitado : listaInvitados){
            if (invitado.getNombre().equals(nombre)){
                return true;
            }
        }
        return false;
    }

//    public void invitadoAntes(String nombre){
//        if (buscarInvitado(nombre)){
//            LocalDate fecha1 = null;
//            LocalDate fecha2 = null;
//            ArrayList<LocalDate> listaFechas = new ArrayList<>();
//
//            for (Invitado invitado : listaInvitados){
//                if (invitado.getNombre().equals(nombre)){
//                    listaFechas.add(invitado.getFechaVisita());
//                }
//            }
//
//            fecha1 = listaFechas.get(0);
//            fecha2 = listaFechas.get(1);
//
//            if (fecha1.isBefore(fecha2)){
//                System.out.println("El dia "+fecha1+" fue antes");
//            }else {
//                System.out.println("El dia "+fecha2+ " fue antes");
//            }
//
//
//        }
//
//    }

    public void invAntes(String nombre,Programa programa1,Programa programa2){

            LocalDate fecha1 = null;
            LocalDate fecha2 = null;
            for (Invitado invitado : programa1.listaInvitados){
                if (invitado.getNombre().equals(nombre)){
                    fecha1 = invitado.getFechaVisita();
                }
            }

            for (Invitado invitado : programa2.listaInvitados){
                if (invitado.getNombre().equals(nombre)){
                    fecha2 = invitado.getFechaVisita();
                }
            }

            if (fecha1.isBefore(fecha2)){
                System.out.println(nombre+ " estuvo antes en el programa "+programa1.getNombre()+" el dia "+fecha1);
            }else {
                System.out.println(nombre+ " estuvo antes en el programa " + programa2.getNombre()+ " el dia "+fecha2 );
            }

    }

    //--------------------------------------------------------------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(String nombre) {
        Empleado director = new Empleado(nombre,CARGO_DIRECTOR,null);
        this.director = director;
        listaEmpleados.add(director);
    }

    // -------------------------------------------------------------


    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena.getNombre() +
                ", temporadas=" + temporadas +
                ", director=" + director +
                ", Lista empleados= " + listaEmpleados +
                '}';
    }
}
