/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dependencyinjectionexample;

import Componentes.MotorM1000RR;
import Componentes.MotorSerieM3;
import Componentes.MotorSerieM5;
import Vehiculos.BmwM3;
import Vehiculos.BmwSerie3;

/**
 *
 * @author jufeq
 */
public class DependencyInjectionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MotorSerieM3 motorSerieM3 = new MotorSerieM3();
        BmwM3 bmwm3 = new BmwM3(motorSerieM3);
        
        MotorM1000RR motorM1000RR = new MotorM1000RR();
        Vehiculo bmws3 = new BmwSerie3(motorM1000RR);
    }
    
}
