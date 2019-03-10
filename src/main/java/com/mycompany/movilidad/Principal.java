/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movilidad;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal, donde se crea todos los elementos 
 * @author Cristian
 */
public class Principal {
    List<Vehicle> lista = new ArrayList();
    
    /**
     * constructor de la clase principal
     */
    public Principal() {
        enterData();
        printCars();
    }
    
    /**
     *Este metodo crea todos los vehiculos y los añade a la lista de vehiculos
     */    
    public void enterData(){
        Vehicle bi = new Bicycle(5, "Montaña", "Camino");
        Vehicle car = new Car("Gasolina", "Blanco", 5, 1600, "Nuevo", 2015);
        Vehicle jet = new Jet("Gasolina", "Negro", 5, 4, 300);
        Vehicle skate = new SkateBoard(80, "Dragon");
        
        lista.add(bi);
        lista.add(car);
        lista.add(jet);
        lista.add(skate);
        
    }
    
    /**
     * Este metodo evalua e imprime todos los vehiculos de la lista 
     */
    public void printCars(){
        System.out.println("-----TIPOS DE VEHICULOS-----");
        for (Vehicle vehicle : lista) {
            if (vehicle instanceof Bicycle) {
                System.out.println("");
                Bicycle bin=(Bicycle)vehicle;
                bin.imprimir();
                System.out.println("El tipo es: "+ bin.getBicycleType());
            }else if (vehicle instanceof Car) {
                System.out.println("");
                System.out.println("tipo vehiculo: Carro");
                System.out.println("El estado del carro es: " + ((Car)vehicle).getState());
            }else if (vehicle instanceof Jet) {
                System.out.println("");
                System.out.println("tipo vehiculo: Jet");
                System.out.println("El jet tiene una velocidad de: " + ((Jet)vehicle).getSpeed());
            }else{
                System.out.println("");
                SkateBoard skan = (SkateBoard)vehicle;
                skan.imprimir();
                System.out.println("Sticker: "+skan.getSticker());
            }
                
        }
    }
}
