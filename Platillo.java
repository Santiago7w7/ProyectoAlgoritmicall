package com.domain;

import java.io.Serializable;

/**
 *
 * @author Santaigo
 */
public class Platillo implements Serializable{
    
    private String nombrePlatillo;
    private double precioPlatillo;
    
    public Platillo(String nombrePlatillo, double precioPlatillo){
        this.nombrePlatillo = nombrePlatillo;
        this.precioPlatillo = precioPlatillo;
    }

    public String getNombrePlatillo() {
        return nombrePlatillo;
    }

    public void setNombrePlatillo(String nombrePlatillo) {
        this.nombrePlatillo = nombrePlatillo;
    }

    public double getPrecioPlatillo() {
        return precioPlatillo;
    }

    public void setPrecioPlatillo(double precioPlatillo) {
        this.precioPlatillo = precioPlatillo;
    }

    @Override
    public String toString() {
        return nombrePlatillo + " - S/." + precioPlatillo;
    }
 
}