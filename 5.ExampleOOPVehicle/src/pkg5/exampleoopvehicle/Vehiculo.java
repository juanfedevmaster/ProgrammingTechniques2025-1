/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5.exampleoopvehicle;

/**
 *
 * @author jufeq
 */
public class Vehiculo {

    private int year;
    private String color;
    private String brand;
    private String model;

    public Vehiculo() {
    }

    public Vehiculo(int year, String color, String brand, String model) {
        this.year = year;
        this.color = color;
        this.brand = brand;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
