package juegocartas;

import Entidades.Baraja;
import Servicios.crearJuego;

public class JuegoCartas {
    public static void main(String[] args) {
        crearJuego jugar = new crearJuego();
        
        Baraja baraja = jugar.crearBaraja();
        System.out.println(baraja);
        
        jugar.barajar(baraja);
        
        System.out.println(baraja);
        
        
    }
    
    
    
}
