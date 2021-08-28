
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ignac
 */
public class Eventos {
    private int id;
    private String nombre;
    private String fecha_Evento;
    private String capacidad_MAX;
    private String cantidad_Categorias;
    private String tamMAX_POR_CATEGORIA;
    private ArrayList<Region> ubicacion_evento = new ArrayList<Region>();
    private String lugar;

    //Contructores
    public Eventos(int id, String nombre, String fecha_Evento, String capacidad_MAX, String lugar) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_Evento = fecha_Evento;
        this.capacidad_MAX = capacidad_MAX;
        this.lugar = lugar;
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

    public String getFecha_Evento() {
        return fecha_Evento;
    }

    public void setFecha_Evento(String fecha_Evento) {
        this.fecha_Evento = fecha_Evento;
    }

    public String getCapacidad_MAX() {
        return capacidad_MAX;
    }

    public void setCapacidad_MAX(String capacidad_MAX) {
        this.capacidad_MAX = capacidad_MAX;
    }

    public ArrayList<Region> getUbicacion_evento() {
        return ubicacion_evento;
    }

    public void setUbicacion_evento(ArrayList<Region> ubicacion_evento) {
        this.ubicacion_evento = ubicacion_evento;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }


}
