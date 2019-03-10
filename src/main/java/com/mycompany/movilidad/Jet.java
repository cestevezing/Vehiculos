/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movilidad;

/**
 * Clase jet que extiende de la clase vehiculo de poder
 * @author Crsitian
 */
public class Jet extends PowerwdVehicle{
    private int engineCount;
    private int speed;

    /**
     * Constructor de la clase Jet
     * @param fuelType
     * @param color
     * @param doors
     * @param engineCount
     * @param speed 
     */
    public Jet(String fuelType, String color, int doors,int engineCount,int speed) {
        super(fuelType, color, doors);
        this.engineCount = engineCount;
        this.speed = speed;
        
    }
    

    public int getEngineCount() {
        return engineCount;
    }

    public void setEngineCount(int engineCount) {
        this.engineCount = engineCount;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    
}
