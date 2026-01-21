package org.example;

public class Libro {

    private static int cantidadLibros = 0;
    private static int librosDisponibles = 0;

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        disponible = true;
        ++cantidadLibros;
        ++librosDisponibles;
        id=calcularID();
    }

    private static String calcularID(){
        return "LIB00"+cantidadLibros;
    }

    public void prestar(){
        if (disponible){
            disponible=false;
            librosDisponibles--;
            System.out.println("El libro ha sido prestado con éxito");
        }else {
            System.out.println("El libro ya está prestado, no se puede prestar");
        }

    }

    public void devolver(){
        if (!disponible){
            disponible = true;
            librosDisponibles++;
            System.out.println("El libro ha sido devuelto con éxito");
        }else {
            System.out.println("El libro no estaba prestado");
        }
    }

    public boolean estaDisponible(){
        return disponible;
    }

    public static int getTotalLibros(){
        return cantidadLibros;
    }

    public static int getLibrosDisponibles(){
        return librosDisponibles;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() { // \n baja de linea
        return "Total de libros creados: " + cantidadLibros + '\n'+
                "Libros disponibles: " + librosDisponibles + '\n' +
                ", autor='" + autor + '\'' +
                ", id='" + id + '\'' +
                ", disponible=" + disponible +
                '}';
    }



}
