/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movilidad;

/**
 * Clase carro que extiende de la clase vehiculo de poder
 * @author Cristian
 */
public class Car extends PowerwdVehicle{
    private int engineSize;
    private String state;
    private int year;

    /**
     * Constructor de la clase Car
     * @param fuelType
     * @param color
     * @param doors
     * @param engineSize
     * @param state
     * @param year 
     */
    public Car(String fuelType, String color, int doors, int engineSize,String state,int year) {
        super(fuelType, color, doors);
        this.engineSize = engineSize;
        this.state = state;
        this.year = year;
                
    }
    
    
    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
    
}
