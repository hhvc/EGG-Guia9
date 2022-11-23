package Servicios;

import Entidades.Baraja;
import Entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;

public class crearJuego{
    
    public Baraja crearBaraja(){
    Baraja baraja = new Baraja();
    ArrayList<Carta> barajaAux = new ArrayList();
    String[] numero = {"1","2", "3", "4", "5", "6","7","10","11","12"};
    String[] palo = {"Espada", "Basto", "Copa", "Oro"};
        for (String valNum : numero) {
            for (String valPal : palo) {
                barajaAux.add(new Carta(valNum, valPal));
            }
        }
    baraja.setCartas(barajaAux);
    return baraja;
    }
    
    public void barajar(Baraja b){
        Collections.shuffle(b.getCartas());
    }
    
}    

    
    
    

