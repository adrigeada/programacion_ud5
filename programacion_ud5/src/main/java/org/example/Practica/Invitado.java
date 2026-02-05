package org.example.Practica;

import java.time.LocalDate;
import java.util.Scanner;

public class Invitado {
    static Scanner teclado = new Scanner(System.in);

    private String nombre;
    private String profesion;
    private LocalDate fechaVisita;
    private int temporada;


    public Invitado (String nombre,String profesion,int temporada){
        this.nombre = nombre;
        this.profesion = profesion;
        setFechaVisita();
        this.temporada = temporada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public LocalDate getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita() {
        System.out.println("En que año vendrá el invitado "+nombre);
        int anyo = teclado.nextInt();
        System.out.println("Introduce el mes: ");
        int mes = teclado.nextInt();
        System.out.println("Introduce el dia: ");
        int dia = teclado.nextInt();

        LocalDate fecha = LocalDate.of(anyo,mes,dia);
        fechaVisita = fecha;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fechaVisita=" + fechaVisita +
                ", temporada=" + temporada +
                '}';
    }
}
