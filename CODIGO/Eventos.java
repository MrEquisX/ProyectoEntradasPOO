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
public class Eventos {
    private int idEventos;
    private String name;
    private String fecha_Evento;
    private String idRegion;
    private ArrayList<Entradas> entrada = new ArrayList<Entradas>();

    public Eventos(int idEventos, String name, String fecha_Evento, String idRegion) {
        this.idEventos = idEventos;
        this.name = name;
        this.fecha_Evento = fecha_Evento;
        this.idRegion = idRegion;
    }

    public int getIdEventos() {
        return idEventos;
    }

    public void setIdEventos(int idEventos) {
        this.idEventos = idEventos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFecha_Evento() {
        return fecha_Evento;
    }

    public void setFecha_Evento(String fecha_Evento) {
        this.fecha_Evento = fecha_Evento;
    }

    public String getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(String idRegion) {
        this.idRegion = idRegion;
    }
    
    //Retorna informacion del evento
    public String[] getData(){
        String[] data= new String[4];

        data[0] = Integer.toString(idEventos);
        data[1] = name;
        data[2] = fecha_Evento;
        data[3] = idRegion;
        return data;
    }
    
    //Checkea si existe una entrada segun su id
    public boolean checkEntradas(int id){
    for (Entradas entrada : this.entrada) if (id == entrada.getId()) return true;
        return false;
    }
    
    //Checkea si existe una entrada a traves de su codigo
    public boolean checkEntradas(String codigo) {
        for(Entradas e : entrada) {
            if(e.getEntradaEvento().equals(codigo)) return true;
        }
        return false;
    }
       
}
