package org.example.Tenis;

import java.util.ArrayList;

public class Partido {

    private Jugador jugador1;
    private Jugador jugador2;
    private ArrayList<Set> listaSets;

    public Partido(Jugador jugador1,Jugador jugador2){
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.listaSets = new ArrayList<>();
        jugador1.asignarRival(jugador2);
        jugador2.asignarRival(jugador1);
    }

    public void insertarSet(int puntosJ1, int puntosJ2){
        Set set = new Set(puntosJ1,puntosJ2);
        listaSets.add(set);
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public ArrayList<Set> getListaSets() {
        return listaSets;
    }

    public void setListaSets(ArrayList<Set> listaSets) {
        this.listaSets = listaSets;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "jugador1=" + jugador1 +
                ", jugador2=" + jugador2 +
                '}';
    }
}
