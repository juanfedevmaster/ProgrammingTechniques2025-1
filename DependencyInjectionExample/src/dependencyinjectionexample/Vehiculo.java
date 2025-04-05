/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependencyinjectionexample;

import Interfaces.IMotor;

/**
 *
 * @author jufeq
 */
public class Vehiculo {
    private IMotor motor;

    public Vehiculo(IMotor motor) {
        this.motor = motor;
    }
}
