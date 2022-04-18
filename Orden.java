package com.domain;


import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Santaigo 
 */
public class Orden implements Serializable{
    
    private Platillo [] platillos;
    private double montoTotal;
    private final int cod;
    private static int nOrden;
    
    public Orden(int tamOrden){
        this.platillos = new Platillo[tamOrden];
        this.montoTotal = 0.0;
        this.cod = ++this.nOrden;
    }
    
    public int getCod() {
        return cod;
    }

    public double getMontoTotal() {
        return montoTotal;
    }
    
}
