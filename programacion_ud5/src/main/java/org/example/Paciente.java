package org.example;

import java.util.Random;

public class Paciente {

    static Random aleatorio = new Random();
    private static final char DEF_GENERO = 'X';
    private static final int INFRAPESO = -1;
    private static final int PESO_IDEAL = 0;
    private static final int SOBREPESO = 1;

    private String nombre;
    private int edad;
    private String dni;
    private char genero;
    private double peso;
    private int altura;

    public Paciente (String nombre,int edad, char genero,double peso, int altura){
        this.nombre = nombre;
        this.edad = edad;
        dni = generarDNI();
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }

    public Paciente (){
        this(null,0,DEF_GENERO,0,0); //invoca al constructor de arriba
    }

    private static String generarDNI(){
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y','F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        String dni = "";

        for (int i = 0; i < 8; i++) {
            int num = aleatorio.nextInt(10);
            dni = dni + num;
        }

        int indice = Integer.parseInt(dni) % 23;

        dni = dni + letras[indice];


        return dni;
    }

    public  int calcularIMC(){ //no es static porque el objeto ya está creado. Va a usar los datos de la persona creada cuando usas el new

        double resultado = peso / Math.pow((double) altura /100,2);

        System.out.println(resultado);

        if (resultado < 20 ){
            return INFRAPESO;
        } else if (resultado > 25 ) {
            return SOBREPESO;
        }else {
            return PESO_IDEAL;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }






}


