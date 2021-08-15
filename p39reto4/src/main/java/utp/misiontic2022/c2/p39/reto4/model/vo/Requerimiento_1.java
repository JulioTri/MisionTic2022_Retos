package utp.misiontic2022.c2.p39.reto4.model.vo;

import java.lang.reflect.Constructor;

public class Requerimiento_1 {
    // Operaciones de la clase requerimiento 1 -- su código
    private String fechaCompra;
    private String codigoCompra;
    private String nombreProveedor;
    private String valorPagado;
    
    public Requerimiento_1() {
        
    }

    public Requerimiento_1(String fechaCompra, String codigoCompra, String nombreProveedor, String valorPagado) {
        this.fechaCompra = fechaCompra;
        this.codigoCompra = codigoCompra;
        this.nombreProveedor = nombreProveedor;
        this.valorPagado = valorPagado;        
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(String codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getValorPagado() {
        return valorPagado;
    }

    public void setValorPagado(String valorPagado) {
        this.valorPagado = valorPagado;
    }
}
