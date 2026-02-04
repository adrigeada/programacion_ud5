package org.example.Practica;

public class Empleado {
    private static final String PRE_ID = "EP";
    private static final String CARGO_DIRECTOR = "director";
    private static final String[] POSIBLES_CARGOS = new String[] {"director", "tecnico", "presentador", "colaborador"};

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
        asignarDirector(director);
    }


    public void asignarDirector(Empleado director){

        if (cargo.equals(CARGO_DIRECTOR)){
            this.director = null;
        }else {
            this.director = director;
        }

    }

    public String getId() {
        return id;
    }

    public String setId() {
       return PRE_ID+contadorID;
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
