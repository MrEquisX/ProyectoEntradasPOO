/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGO;

import java.util.ArrayList;

/**
 *
 * @author ignac
 */
class Entradas {
    private int id;
    private String entradaEvento; //Identificador de entrada del evento
    private int precio;
    private ArrayList<Ventas> ventaEntradas = new ArrayList<Ventas>();

    public Entradas(int id, String entradaEvento, int precio) {
        this.id = id;
        this.entradaEvento = entradaEvento;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntradaEvento() {
        return entradaEvento;
    }

    public void setEntradaEvento(String entradaEvento) {
        this.entradaEvento = entradaEvento;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ArrayList<Ventas> getVentaEntradas() {
        return ventaEntradas;
    }

    public void setVentaEntradas(ArrayList<Ventas> ventaEntradas) {
        this.ventaEntradas = ventaEntradas;
    }
    
   
}
