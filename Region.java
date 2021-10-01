/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venta_entradas;

import java.util.ArrayList;

/**
 *
 * @author ignac
 */
public class Region {
    private int id;
    private String name;
    private ArrayList<Eventos> lugar = new ArrayList<Eventos>();
    
//Constructor
        public Region(int id, String name) {
        this.id = id;
        this.name = name;
    }       

    
//Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Eventos> getLugar() {
        return lugar;
    }


//Setters    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLugar(ArrayList<Eventos> lugar) {
        this.lugar = lugar;
    }

    public String[] getData(){
        String data[] = new String[2];
        data[0] = Integer.toString(this.id);
        data[1] = this.name;

        return data;
    }

}
