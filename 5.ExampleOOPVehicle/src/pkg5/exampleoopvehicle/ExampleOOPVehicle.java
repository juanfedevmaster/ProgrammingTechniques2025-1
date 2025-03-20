/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.exampleoopvehicle;

/**
 *
 * @author jufeq
 */
public class ExampleOOPVehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car c = new Car();
        Car p = new Car();
        
        Bike bike = new Bike(1, 1990, "grey", "Yamaha", "115");
        
        Vehiculo bikePoly = new Bike(1, 1990, "green", "Yamaha", "115");
        
        ((Bike)bikePoly).getMotorType();
        
        c.setBrand("Mazda");
        p.setBrand("Toyota");
        
        //System.out.println(c.getBrand());
        //System.out.println(p.getBrand());
        
        System.out.println(bike.getMotorType());
        System.out.println(bike.getBrand());
        System.out.println(bike.getModel());
    }
    
}
