package org.example.Practica;

public class Empleado {
    private static int contadorID = 0;

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;


    public Empleado(String nombre,String cargo,Empleado director){
        ++contadorID;
        id = setId();
        this.nombre = nombre;
        this.cargo = setCargo(cargo);
        this.director = director;
    }

    public String getId() {
        return id;
    }

    public String setId() {
       return "EP"+contadorID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public String setCargo(String cargo) {
        if (cargo.equals("director") || cargo.equals("tecnico") || cargo.equals("presentador") || cargo.equals("colaborador")){
            return cargo;
        }else {
            return "pte";
        }
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + director +
                '}';
    }
}
