/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movilidad;

/**
 * Clase bicicleta que implementa a vehiculo
 * @author Cristian
 */
public class Bicycle implements Vehicle{
    private int gearCount;
    private String bicycleType;
    private String name;
    /**
     * Constructor de la clase Bicycle
     * @param gearCount
     * @param bicycleType
     * @param name 
     */
    public Bicycle(int gearCount, String bicycleType, String name) {
        this.gearCount = gearCount;
        this.bicycleType = bicycleType;
        this.name = name;
    }
    
    /**
     * Este metodo es especializado de la interfaz Vehicle
     */
    @Override
    public void imprimir() {
        System.out.println("tipo de vehiculo: Bicicleta");
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public String getBicycleType() {
        return bicycleType;
    }

    public void setBicycleType(String bicycleType) {
        this.bicycleType = bicycleType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
