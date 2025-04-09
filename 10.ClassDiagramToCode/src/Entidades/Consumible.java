/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 * Representa un producto consumible (alimentos, bebidas, etc.).
 * Contiene etiquetas informativas como "sin gluten", "orgánico", etc.
 */
public class Consumible extends Producto {
    private String[] etiquetas;

    /**
     * Constructor para producto consumible.
     * 
     * @param nombre      Nombre del producto.
     * @param id          Identificador único.
     * @param precioVenta Precio de venta al público.
     * @param precioBruto Precio de costo.
     * @param etiquetas   Etiquetas informativas del producto.
     */
    public Consumible(String nombre, long id, double precioVenta, double precioBruto, String[] etiquetas) {
        super(nombre, id, precioVenta, precioBruto, TipoProducto.CONSUMIBLE);
        this.etiquetas = etiquetas;
    }

    public String[] getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(String[] etiquetas) {
        this.etiquetas = etiquetas;
    }

    /**
     * Imprime en consola las etiquetas del producto consumible.
     */
    @Override
    public void imprimirInformacionExtra() {
        System.out.println("Etiquetas:");
        for (String etiqueta : etiquetas) {
            System.out.println("- " + etiqueta);
        }
    }
}
