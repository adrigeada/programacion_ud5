package org.example;

public class Televisor {
    private int canal;
    private int volumen;

    public Televisor (int valorCanal,int volumen){
        this.canal = valorCanal;
        this.volumen = volumen;
    }
    public Televisor (){
        canal = 1;
        volumen = 5;
    }

    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

public void subirCanal(){
        if (canal == 100){
            canal = 1;
        }else {
            canal = canal+1;
        }
    System.out.println("Estas en el canal :" + canal);

}

public void bajarCanal(){
        if (canal == 1){
            canal = 100;
        }else {
            canal = canal-1;
        }


}



}
