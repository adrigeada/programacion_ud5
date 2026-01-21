package org.example;

public class Libroapp {
    static void main() {
        Libro prueba = new Libro("cosa titulo","Brandon");

        System.out.println(prueba);

        Libro otra = new Libro("El otro titulo" ,"Lorca");

        System.out.println(otra);

        System.out.println(otra.estaDisponible());
        otra.prestar();
        System.out.println(otra.estaDisponible());
        otra.devolver();
        prueba.prestar();

        System.out.println("Total de libros creados: "+Libro.getTotalLibros());
        System.out.println("Total de libros disponibles: "+Libro.getLibrosDisponibles());
    }

}
