package org.example;

public class Libroapp {
    static void main() {
        Estudiante adri = new Estudiante("Adrian", "1ºDAM","hola@alu.edu.gva.es");

        Libro prueba = new Libro("cosa titulo","Brandon");
        Libro yo_robot = new Libro("Yo robot" ,"Asimov");

        System.out.println(yo_robot);
        yo_robot.prestar(adri);
        System.out.println(yo_robot.getEstudiantePrestado());
        System.out.println(yo_robot);
        yo_robot.devolver();
        System.out.println(yo_robot);




        System.out.println("Total de libros creados: "+Libro.getTotalLibros());
        System.out.println("Total de libros disponibles: "+Libro.getLibrosDisponibles());
    }

}
