/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DependencyInversion;

import java.util.Date;

/**
 *
 * @author jufeq
 */
public abstract class Vehiculo {
    
    private String model;
    private Date year;
    private String description;
    
    private IMotor motor;

    public Vehiculo() {
    }

    public Vehiculo(String model, Date year, String description, IMotor motor) {
        this.model = model;
        this.year = year;
        this.description = description;
        this.motor = motor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IMotor getMotor() {
        return motor;
    }

    public void setMotor(IMotor motor) {
        this.motor = motor;
    }

    
    
    
    
    public abstract void engineStart();
    public abstract void engineShutDown();
    
}
