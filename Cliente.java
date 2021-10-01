/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venta_entradas;

public class Cliente {
    private int id;
    private String nombre;
    private String rut;
    private int edad;

    //Contructor
    public Cliente(String nombre, String rut, int edad) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
    }

    //Getters&Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
