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
public abstract class Cliente extends Pago implements Venta {
    private int id;
    private int entradasAcomprar;
    float precioEntrada;

    //Contructor

    public Cliente(String nombre, String rut, boolean socio, String medioPago) {
        super(nombre, rut, socio, medioPago);
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

    public int getEntradasAcomprar() {
        return entradasAcomprar;
    }

    public void setEntradasAcomprar(int entradasAcomprar) {
        this.entradasAcomprar = entradasAcomprar;
    }

    public String getMedioDePago() {
        return medioPago;
    }

    public void setMedioDePago(String medioPago) {
        this.medioPago = medioPago;
    }
   
    //Retorna informacion del cliente que compra
    public String[] getData(){
        String[] data = new String [3];
        
        data[1] = Integer.toString(id);
        data[2] = rut;
        data[3] = nombre;
                
        return data;
    }
    
    public abstract float descuento(int precioEntrada, float descuentoComun, float descuentoSocio) throws Exception;
    
}
