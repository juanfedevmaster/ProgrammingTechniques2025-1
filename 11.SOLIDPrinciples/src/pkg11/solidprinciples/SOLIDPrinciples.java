/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11.solidprinciples;

import DependencyInversion.BMWE30;
import DependencyInversion.IMotor;
import DependencyInversion.MotorM1000RR;
import DependencyInversion.MotorM4;
import InterfaceSegregation.IPrinter;
import InterfaceSegregation.Printer;
import LiskovSustitution.Circle;
import LiskovSustitution.Figure;
import LiskovSustitution.Triangle;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jufeq
 */
public class SOLIDPrinciples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // Liskov Sustitution
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        Date date = format.parse("1990/01/01");
        
        IMotor motor = new MotorM4();
        
        BMWE30 bmwe30 = new BMWE30("E30", date, "Modelo Especial Serie M", motor);
        
        System.out.println(bmwe30.getMotor().getCapacity());
        System.out.println(bmwe30.getMotor().getCompresion());
    }
    
}
