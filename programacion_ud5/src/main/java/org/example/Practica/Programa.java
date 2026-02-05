package org.example.Practica;

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
