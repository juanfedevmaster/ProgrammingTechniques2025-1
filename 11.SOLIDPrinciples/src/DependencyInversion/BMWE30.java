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
public class BMWE30 extends Vehiculo{

    public BMWE30() {
    }

    public BMWE30(String model, Date year, String description, IMotor motor) {
        super(model, year, description, motor);
    }

    
    @Override
    public void engineStart() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void engineShutDown() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
