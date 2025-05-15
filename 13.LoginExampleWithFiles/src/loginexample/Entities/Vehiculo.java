package loginexample.Entities;

import loginexample.Entities.Interfaces.IFreno;

/**
 * Clase abstracta Vehiculo
 */
public abstract class Vehiculo {
    // Atributos
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private double precio;
    private IFreno freno;

    // Constructor vacío
    public Vehiculo() {
    }

    // Constructor con atributos
    public Vehiculo(String marca, String modelo, int anio, String color, double precio, IFreno freno) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.precio = precio;
        this.freno = freno;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public IFreno getFreno() {
        return freno;
    }

    public void setFreno(IFreno freno) {
        this.freno = freno;
    }
}