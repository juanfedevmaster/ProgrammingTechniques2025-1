/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import org.bson.Document;

/**
 *
 * @author jufeq
 */
public class Vehiculo {
    private String brand;
    private String name;
    private String type;
    private int yearIntroduced;

    public Vehiculo() {
    }

    public Vehiculo(String brand, String name, String type, int yearIntroduced) {
        this.brand = brand;
        this.name = name;
        this.type = type;
        this.yearIntroduced = yearIntroduced;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearIntroduced() {
        return yearIntroduced;
    }

    public void setYearIntroduced(int yearIntroduced) {
        this.yearIntroduced = yearIntroduced;
    }
    
    public static Vehiculo fromDocument(Document doc){
        return new Vehiculo(doc.getString("brand"), doc.getString("name"),doc.getString("type"),doc.getInteger("yearIntroduced"));
    }
    
    public Document toDocument(){
        return new Document("brand", brand)
                .append("name", name)
                .append("type", type)
                .append("yearIntroduced", yearIntroduced);
    }
}
