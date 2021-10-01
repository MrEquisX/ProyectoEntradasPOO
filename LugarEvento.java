/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venta_entradas;


class LugarEvento { 
    private String nombreLugar;
    private int capacidad;
    
//Constructor  
    public LugarEvento(String nombreLugar, int capacidad) {
        this.nombreLugar = nombreLugar;
        this.capacidad = capacidad;
    }

//Getters
    public String getNombreLugar() {
        return nombreLugar;
    }

    public int getCapacidad() {
        return capacidad;
    }

//Setters
    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
}
