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
public class ClienteSocio extends Cliente {

    public ClienteSocio(String nombre, String rut, boolean socio, String medioPago) {
        super(nombre, rut, socio, medioPago);
    }
    
    @Override
    public void descuento() {
        //Se entregara una funcion que de descuento a los socios
    }

    @Override
    public void imprimeInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
