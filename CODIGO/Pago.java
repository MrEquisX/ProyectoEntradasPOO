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
public class Pago extends Exception {
    protected String nombre;
    protected String rut;
    protected boolean socio;
    protected String medioPago;

    public Pago(String nombre, String rut, boolean socio, String medioPago) {
        this.nombre = nombre;
        this.rut = rut;
        this.socio = socio;
        this.medioPago = medioPago;
    }

    public void imprimeInformacion(){
        System.out.println("El cliente si/no socio: " +socio);
        System.out.println("El medio de pago del cliente es: "+medioPago);
    }
    
}
