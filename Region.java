/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ignac
 */

public class Region {
    private int id;
    private String nombre;
    
    //Contructores
    public Region(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
    
    
}
