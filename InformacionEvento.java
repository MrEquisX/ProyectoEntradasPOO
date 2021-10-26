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
public class InformacionEvento extends Eventos{
    private int cantidadEntradas;
    private int precioEntradas;
    private String lugarEvento;

    public InformacionEvento(int idEventos, String name, String fecha_Evento, String idRegion) {
        super(idEventos, name, fecha_Evento, idRegion);
    }

    public InformacionEvento(int cantidadEntradas, int precioEntradas, String lugarEvento, int idEventos, String name, String fecha_Evento, String idRegion) {
        super(idEventos, name, fecha_Evento, idRegion);
        this.cantidadEntradas = cantidadEntradas;
        this.precioEntradas = precioEntradas;
        this.lugarEvento = lugarEvento;
    }
    
    public int getCantidadEntradas() {
        return cantidadEntradas;
    }

    public void setCantidadEntradas(int cantidadEntradas) {
        this.cantidadEntradas = cantidadEntradas;
    }

    public int getPrecioEntradas() {
        return precioEntradas;
    }

    public void setPrecioEntradas(int precioEntradas) {
        this.precioEntradas = precioEntradas;
    }

    public String getLugarEvento() {
        return lugarEvento;
    }

    public void setLugarEvento(String lugarEvento) {
        this.lugarEvento = lugarEvento;
    }
    
    //ENTREGA INFORMACION SOBRE EL EVENTO EN VER MAS...
    @Override
    public String[] getData(){
        String[] data= new String[3];

        data[0] = Integer.toString(cantidadEntradas);
        data[1] = Integer.toString(precioEntradas);
        data[2] = lugarEvento;
        
        return data;
    }
}
