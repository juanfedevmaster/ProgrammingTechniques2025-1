/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 * Clase abstracta que representa un producto genérico de la farmacia.
 * Contiene atributos comunes como nombre, precio y tipo de producto.
 */
public abstract class Producto {
    private String nombre;
    private long id;
    private double precioVenta;
    private double precioBruto;
    private TipoProducto tipoProducto;

    /**
     * Constructor del producto.
     * 
     * @param nombre       Nombre del producto.
     * @param id           Identificador único del producto.
     * @param precioVenta  Precio de venta al público.
     * @param precioBruto  Precio de costo o base.
     * @param tipoProducto Tipo de producto (enum).
     */
    public Producto(String nombre, long id, double precioVenta, double precioBruto, TipoProducto tipoProducto) {
        this.nombre = nombre;
        this.id = id;
        this.precioVenta = precioVenta;
        this.precioBruto = precioBruto;
        this.tipoProducto = tipoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public long getId() {
        return id;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = precioBruto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    /**
     * Método abstracto que imprime información adicional del producto.
     * Debe ser implementado por las subclases.
     */
    public abstract void imprimirInformacionExtra();
}

