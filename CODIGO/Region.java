/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGO;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author ignac
 */
public class Region {
    private String id;
    private String nombre;
    private ArrayList<Eventos> evento = new ArrayList<Eventos>();
    private ArrayList<ComboItems> jCombo = new ArrayList<ComboItems>();

//Constructor    

    public Region(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
       
//Getters&Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Eventos> getEvento() {
        return evento;
    }

    public void setEvento(ArrayList<Eventos> evento) {
        this.evento = evento;
    }

    public ArrayList<ComboItems> getjCombo() {
        return jCombo;
    }

    public void setjCombo(ArrayList<ComboItems> jCombo) {
        this.jCombo = jCombo;
    }
    
//ENTREGA INFORMACION    
    public String[] getData(){
        String data[] = new String[2];
        data[0] = this.id;
        data[1] = this.nombre;

        return data;
    }
}
