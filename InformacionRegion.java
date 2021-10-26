/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGO;

/**
 *
 * @author ignac
 */
public class InformacionRegion extends Region{
    
    private String puntoEncuentro;
    private int aforoMAX;
    private String descripcionLugar;

    public InformacionRegion(String id, String nombre) {
        super(id, nombre);
    }

    public InformacionRegion(String puntoEncuentro, int aforoMAX, String descripcionLugar, String id, String nombre) {
        super(id, nombre);
        this.puntoEncuentro = puntoEncuentro;
        this.aforoMAX = aforoMAX;
        this.descripcionLugar = descripcionLugar;
    }
   
    public String getPuntoEncuentro() {
        return puntoEncuentro;
    }

    public void setPuntoEncuentro(String puntoEncuentro) {
        this.puntoEncuentro = puntoEncuentro;
    }

    public int getAforoMAX() {
        return aforoMAX;
    }

    public void setAforoMAX(int aforoMAX) {
        this.aforoMAX = aforoMAX;
    }

    public String getDescripcionLugar() {
        return descripcionLugar;
    }

    public void setDescripcionLugar(String descripcionLugar) {
        this.descripcionLugar = descripcionLugar;
    }
    
    //ENTREGA INFORMACION PARA VER MAS...    
    @Override
    public String[] getData(){
        String data[] = new String[3];
        data[0] = puntoEncuentro;
        data[1] = Integer.toString(aforoMAX);
        data[2] = descripcionLugar;

        return data;
    }
}
