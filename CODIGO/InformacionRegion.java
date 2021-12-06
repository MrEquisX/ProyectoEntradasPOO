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
    
    private String zonaRegion;
    private String descripcionLugar;

    public InformacionRegion(String id, String nombre) {
        super(id, nombre);
    }

    public InformacionRegion(String zonaRegion, String descripcionLugar, String id, String nombre) {
        super(id, nombre);
        this.zonaRegion = zonaRegion;
        this.descripcionLugar = descripcionLugar;
    }

    public String getZonaRegion() {
        return zonaRegion;
    }

    public void setZonaRegion(String zonaRegion) {
        this.zonaRegion = zonaRegion;
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
        String data[] = new String[2];
        data[0] = zonaRegion;
        data[1] = descripcionLugar;

        return data;
    }

}
