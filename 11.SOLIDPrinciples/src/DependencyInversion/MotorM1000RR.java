/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DependencyInversion;

/**
 *
 * @author jufeq
 */
public class MotorM1000RR implements IMotor{

    @Override
    public double getCapacity() {
        return 218;
    }

    @Override
    public String getCompresion() {
        return "13.1:1";
    }
    
}
