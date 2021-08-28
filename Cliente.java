/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ignac
 */
public class Cliente {
    private int id;
    private String nombre;
    private String rut;
    private int edad;
    private String num_Telefonico;

    //Contructores
    public Cliente(int id, String nombre, String rut, int edad, String num_Telefonico) {
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        this.num_Telefonico = num_Telefonico;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNum_Telefonico() {
        return num_Telefonico;
    }

    public void setNum_Telefonico(String num_Telefonico) {
        this.num_Telefonico = num_Telefonico;
    }
        
}
