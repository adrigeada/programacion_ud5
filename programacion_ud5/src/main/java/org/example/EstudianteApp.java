package org.example;

public class EstudianteApp {
    static void main() {

        Estudiante jorge = new Estudiante("Jorge", "1ºDAM", "jorgeestudiante@gmail.com");

        System.out.println(jorge.getNia());
        System.out.println(jorge);

        Estudiante raul = new Estudiante("Raul");

        System.out.println(raul.getNia());
        System.out.println(raul);

        Estudiante adri = new Estudiante("Adri");
        System.out.println(adri);

    }
}
