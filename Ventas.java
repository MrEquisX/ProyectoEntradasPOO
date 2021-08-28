import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ignac
 */

public class Ventas {
    private int id;
    private ArrayList<Cliente> id_Cliente = new ArrayList<Cliente>();
    private String cantidad_Entradas_aComprar;
    private ArrayList<Entradas> monto_TOTAL_aPagar = new ArrayList<Entradas>();
    private String tipo_PAGO;
    private String nro_Tarjeta;
    private String fecha_Venta;
    private String nro_Factura;
    private String detallesVenta;

    //Contructores
    public Ventas(int id, String cantidad_Entradas_aComprar, String tipo_PAGO, String nro_Tarjeta, String fecha_Venta, String nro_Factura, String detallesVenta) {
        this.id = id;
        this.cantidad_Entradas_aComprar = cantidad_Entradas_aComprar;
        this.tipo_PAGO = tipo_PAGO;
        this.nro_Tarjeta = nro_Tarjeta;
        this.fecha_Venta = fecha_Venta;
        this.nro_Factura = nro_Factura;
        this.detallesVenta = detallesVenta;
    }
    
    //Getters&Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Cliente> getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(ArrayList<Cliente> id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getCantidad_Entradas_aComprar() {
        return cantidad_Entradas_aComprar;
    }

    public void setCantidad_Entradas_aComprar(String cantidad_Entradas_aComprar) {
        this.cantidad_Entradas_aComprar = cantidad_Entradas_aComprar;
    }

    public ArrayList<Entradas> getMonto_TOTAL_aPagar() {
        return monto_TOTAL_aPagar;
    }

    public void setMonto_TOTAL_aPagar(ArrayList<Entradas> monto_TOTAL_aPagar) {
        this.monto_TOTAL_aPagar = monto_TOTAL_aPagar;
    }

    public String getTipo_PAGO() {
        return tipo_PAGO;
    }

    public void setTipo_PAGO(String tipo_PAGO) {
        this.tipo_PAGO = tipo_PAGO;
    }

    public String getNro_Tarjeta() {
        return nro_Tarjeta;
    }

    public void setNro_Tarjeta(String nro_Tarjeta) {
        this.nro_Tarjeta = nro_Tarjeta;
    }

    public String getFecha_Venta() {
        return fecha_Venta;
    }

    public void setFecha_Venta(String fecha_Venta) {
        this.fecha_Venta = fecha_Venta;
    }

    public String getNro_Factura() {
        return nro_Factura;
    }

    public void setNro_Factura(String nro_Factura) {
        this.nro_Factura = nro_Factura;
    }

    public String getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(String detallesVenta) {
        this.detallesVenta = detallesVenta;
    }
    
    
}