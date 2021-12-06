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
    private int idEvento;    
    private String entradaEvento; //Identificador de entrada del evento
    private int precio;
    private ArrayList<Venta> ventaEntradas = new ArrayList<Venta>();

    public Entradas(int id, int idEvento, String entradaEvento, int precio) {
        this.id = id;
        this.idEvento = idEvento;
        this.entradaEvento = entradaEvento;
        this.precio = precio;
    }

    public Entradas(int idEvento, String entradaEvento, int precio) {
        this.idEvento = idEvento;
        this.entradaEvento = entradaEvento;
        this.precio = precio;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
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
    
    //Retorna informacion de las entradas
    public String[] getData(){
        String[] data= new String[3];

        data[0] = Integer.toString(idEvento);
        data[1] = entradaEvento;
        data[2] = Integer.toString(precio);

        return data;
    }
      
}
