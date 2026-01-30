package org.example.Tenis;

public class Set {

    private int puntosJ1;
    private int puntosJ2;


    public Set (int puntosJ1,int puntosJ2){
        setPuntosJ1(puntosJ1,puntosJ2,1);
        setPuntosJ2(puntosJ2,puntosJ1,2);
    }


    public int getPuntosJ1() {
        return puntosJ1;
    }

    public void setPuntosJ1(int puntosJ1,int puntosJ2, int control) {

        if (puntosJ1 < 0){
            System.out.println("Los puntos tienen que ser mayor a 0");
            return;
        } else if (puntosJ1 > 7) {
            System.out.println("Los puntos no pueden ser mayor de 7");
            return;
        } else if (puntosJ1 == 6 && puntosJ2 > 5) {
            System.out.println("Tiene que haber tie-break");
            return;
        } else if (puntosJ1 == 7 && puntosJ2 != 6) {
            System.out.println("Faltan puntos del tie-break");
            return;
        } else if (puntosJ1 <6 && puntosJ2 < 6) {
            System.out.println("No ha acabado el set");
            return;
        }

        if (control == 1){
            System.out.println("Puntos J1 añadidos");
            this.puntosJ1 = puntosJ1;
        }if (control == 2){
            System.out.println("Puntos J2 añadidos");

        }


    }

    public int getPuntosJ2() {
        return puntosJ2;
    }

    public void setPuntosJ2(int puntosJ2, int puntosJ1,int control) {

        setPuntosJ1(puntosJ2,puntosJ1,control);
        this.puntosJ2 = puntosJ2;
    }

    @Override
    public String toString() {
        return "Set{" +
                "puntosJ1=" + puntosJ1 +
                ", puntosJ2=" + puntosJ2 +
                '}';
    }
}

