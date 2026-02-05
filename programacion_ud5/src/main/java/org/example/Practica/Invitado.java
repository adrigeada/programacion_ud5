package org.example.Practica;

import java.time.LocalDate;

public class Invitado {
    private String nombre;
    private String profesion;
    private LocalDate fechaVisita;
    private int temporada;


    public Invitado (String nombre,String profesion,int temporada){
        this.nombre = nombre;
        this.profesion = profesion;
        fechaVisita = LocalDate.now();
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

    public void setFechaVisita(LocalDate fechaVisita) {
        this.fechaVisita = fechaVisita;
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
