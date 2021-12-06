/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGO;

import java.util.ArrayList;

/**
 *
 * @author ignac
 */
public class ClienteComun extends Cliente{
    

    public ClienteComun(int precioEntrada, String nombre, String rut, boolean socio, String medioPago) {
        super(nombre, rut, socio, medioPago);
        this.precioEntrada = precioEntrada;
    }
    
    public ClienteComun(String nombre, String rut, boolean socio, String medioPago) {
        super(nombre, rut, socio, medioPago);
    }
     

    @Override
    public float descuento(int precioEntrada, float descuentoComun, float descuentoSocio) throws Exception {
        ArrayList<Entradas> listaEntrada = new ArrayList();
        listaEntrada = CSVCode.cargarEntrada();
        float result = 0;
        descuentoComun = (float) 0.03;
        
         for (Entradas e : listaEntrada){
            if (e.getPrecio() == precioEntrada){
                 result = (int) (precioEntrada*descuentoComun);                                  
            }
        }
        return result; 
    }

    @Override
    public float calcularPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getResultado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    

