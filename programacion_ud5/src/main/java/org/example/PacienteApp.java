package org.example;

public class PacienteApp {
    static void main() {


        Paciente adri = new Paciente();

        System.out.println(adri.getDni() + " "+ adri.getNombre() );

        Paciente prueba = new Paciente("Patri", 32, 'M' , 40, 160);

        System.out.println(prueba.calcularIMC());


    }
}
