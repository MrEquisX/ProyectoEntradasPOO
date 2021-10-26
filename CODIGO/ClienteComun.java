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
public class ClienteComun extends Cliente{

    public ClienteComun(int id, String nombre, String rut, int entradasAcomprar) {
        super(id, nombre, rut, entradasAcomprar);
    }
    
    @Override
    public void descuento() {
    //Se entregara una funcion que de descuento a los socios      
    }
    
}
    

