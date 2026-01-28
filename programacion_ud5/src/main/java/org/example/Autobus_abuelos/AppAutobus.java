package org.example.Autobus_abuelos;

public class AppAutobus {
    static void main() {
        Abuelo juan = new Abuelo("Juan", 70);
        Abuelo jose = new Abuelo("Jose", 75);
        Abuelo angeles = new Abuelo("Ángeles", 72);
        AutobusImserso alsa = new AutobusImserso("1234ASD","Albacete");

        alsa.insertarAbuelo(juan);
        alsa.insertarAbuelo(jose);
        alsa.insertarAbuelo(angeles);

        System.out.println(AutobusImserso.getListaAbuelos());

    }

}
