/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGO;

/**
 *
 * @author ignac
 */
public abstract class Cliente {
    private int id;
    private String nombre;
    private String rut;
    private int entradasAcomprar;

    //Contructor

    public Cliente(int id, String nombre, String rut, int entradasAcomprar) {
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
        this.entradasAcomprar = entradasAcomprar;
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

    public int getEntradasAcomprar() {
        return entradasAcomprar;
    }

    public void setEntradasAcomprar(int entradasAcomprar) {
        this.entradasAcomprar = entradasAcomprar;
    }
    
    //Retorna informacion del cliente que compra
    public String[] getData(){
        String[] data = new String [3];
        
        data[1] = Integer.toString(id);
        data[2] = rut;
        data[3] = nombre;
                
        return data;
    }
    
    public abstract void descuento();
    
}
