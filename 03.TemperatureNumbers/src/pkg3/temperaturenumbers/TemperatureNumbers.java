/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.temperaturenumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jufeq
 */
public class TemperatureNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> temperatures = new ArrayList<>();
        
        temperatures.add("Medellín: 23.5°C");
        temperatures.add("Bogotá: -2.4C");
        temperatures.add("Cali: 30.1 grados");
        temperatures.add("23C - Cartagena");
        temperatures.add("Barranquilla tiene 31.6°C");
        temperatures.add("Valledupar: errpr");
        temperatures.add("Popayan 18.2°");
        temperatures.add("San Andrés: 25.0");
        
        // -?\d+(\.\d+)?
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        List<Double> validTemperatures = new ArrayList<>();
        for (String reg : temperatures) {
            Matcher match = pattern.matcher(reg);
            
            if(match.find()){
                double temperature = Double.parseDouble(match.group());
                validTemperatures.add(temperature);
                System.out.println(temperature);
            }
        }
        
    }
    
}
