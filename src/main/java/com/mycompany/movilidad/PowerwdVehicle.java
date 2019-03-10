/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movilidad;

/**
 *  Clase vehiculo de poder, implementa a vehiculo
 * @author Cristian
 */
public abstract class PowerwdVehicle implements Vehicle{
    private String fuelType;
    private String color;
    private int doors;

    /**
     * Construtor de la clase PoweredVehicle
     * @param fuelType
     * @param color
     * @param doors 
     */
    public PowerwdVehicle(String fuelType, String color, int doors) {
        this.fuelType = fuelType;
        this.color = color;
        this.doors = doors;
    }
    
    /**
     * Metodo  Este metodo es especializado de la interfaz Vehicle
     */
    @Override
    public void imprimir() {
        System.out.println("Esto es un vehiculo de poder");
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
    
    
    
}
