/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venta_entradas;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author ignac
 */
class Eventos {
    private int idEventos;
    private String name;
    private String fecha_Evento;
    private ArrayList<Entradas> entrada = new ArrayList<Entradas>();
    private HashMap <Integer, LugarEvento> lugares = new HashMap <Integer, LugarEvento>();
  

//Constructor
    public Eventos(int idEventos, String name, String fecha_Evento) {
        this.idEventos = idEventos;
        this.name = name;
        this.fecha_Evento = fecha_Evento;
    }
    
      
//Getters
    public int getIdEventos() {
        return idEventos;
    }

    public String getName() {
        return name;
    }

    public String getFecha_Evento() {
        return fecha_Evento;
    }
    
    
//Setters
    public void setIdEventos(int idEventos) {
        this.idEventos = idEventos;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFecha_Evento(String fecha_Evento) {
        this.fecha_Evento = fecha_Evento;
    }

    
//Metodos
//Retorna informacion del evento
    public String[] getData(){
        String[] data= new String[3];

        data[0] = Integer.toString(idEventos);
        data[1] = name;
        data[2] = fecha_Evento;        

        return data;
    }
    
}
