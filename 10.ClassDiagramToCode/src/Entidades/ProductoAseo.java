/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 * Representa un producto de aseo personal.
 * Contiene advertencias específicas relacionadas con su uso.
 */
public class ProductoAseo extends Producto {
    private String[] advertencias;

    /**
     * Constructor para un producto de aseo.
     * 
     * @param nombre       Nombre del producto.
     * @param id           Identificador único.
     * @param precioVenta  Precio de venta al público.
     * @param precioBruto  Precio de costo.
     * @param advertencias Advertencias del producto.
     */
    public ProductoAseo(String nombre, long id, double precioVenta, double precioBruto, String[] advertencias) {
        super(nombre, id, precioVenta, precioBruto, TipoProducto.PRODUCTO_ASEO);
        this.advertencias = advertencias;
    }

    public String[] getAdvertencias() {
        return advertencias;
    }

    public void setAdvertencias(String[] advertencias) {
        this.advertencias = advertencias;
    }

    /**
     * Imprime en consola las advertencias del producto de aseo.
     */
    @Override
    public void imprimirInformacionExtra() {
        System.out.println("Advertencias:");
        for (String advertencia : advertencias) {
            System.out.println("- " + advertencia);
        }
    }
}
