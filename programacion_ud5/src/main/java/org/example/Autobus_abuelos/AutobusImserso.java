package org.example.Autobus_abuelos;

import java.util.ArrayList;

public class AutobusImserso {

    static private ArrayList<Abuelo> listaAbuelos = new ArrayList<>();

    private String matricula;
    private String destino;


    public AutobusImserso(String matricula, String destino){
        this.matricula = matricula;
        this.destino = destino;

    }

    public void insertarAbuelo(Abuelo abuelo){

        listaAbuelos.add(abuelo);

    }


    public static ArrayList<Abuelo> getListaAbuelos() {
        return listaAbuelos;
    }

    public static void setListaAbuelos(ArrayList<Abuelo> listaAbuelos) {
        AutobusImserso.listaAbuelos = listaAbuelos;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "AutobusImserso{" +
                "matricula='" + matricula + '\'' +
                ", destino='" + destino + '\'' +
                '}';
    }
}

