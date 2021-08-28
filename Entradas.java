/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ignac
 */
public class Entradas {
    private int id;
    private int catogoria;
    private String precio;
    private String asiento;
      
    //Contructores
    public Entradas(int id, int catogoria, String precio, String asiento) {
        this.id = id;
        this.catogoria = catogoria;
        this.precio = precio;
        this.asiento = asiento;
    }
    
    //Getters&Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCatogoria() {
        return catogoria;
    }

    public void setCatogoria(int catogoria) {
        this.catogoria = catogoria;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }
  
}
