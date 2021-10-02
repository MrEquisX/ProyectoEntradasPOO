/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venta_entradas;

import java.util.ArrayList;

public class Entradas {
    private int id;
    private String categoria;
    private long precio;
    private String entradaEvento; //Identificador de entrada del evento
    private boolean agotada; //Si es que se encuentran agotadas o no
    private ArrayList<Ventas> ventaEntradas = new ArrayList<Ventas>();

    public Entradas(int id, String categoria, long precio, String entradaEvento, boolean agotada) {
        this.id = id;
        this.categoria = categoria;
        this.precio = precio;
        this.entradaEvento = entradaEvento;
        this.agotada = false;
    }
    //Getters
    public int getId() { return id; }
    public String getCategoria() { return categoria; }
    public long getPrecio() { return precio; }
    public String getEntradaEvento() { return entradaEvento; }
    public boolean getAgotada() { return agotada; }
    public ArrayList<Ventas> getVentaEntradas() {
        return ventaEntradas;
    }
    

    //Setters
    public void setId(int id) { this.id = id; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setPrecio(long precio) { this.precio = precio; }
    public void setEntradaEvento(String entradaEvento) { this.entradaEvento = entradaEvento; }
    public void setAgotada(boolean agotada) { this.agotada = true; }
    public void setVentaEntradas(ArrayList<Ventas> ventaEntradas) {
        this.ventaEntradas = ventaEntradas;
    }
  
}
