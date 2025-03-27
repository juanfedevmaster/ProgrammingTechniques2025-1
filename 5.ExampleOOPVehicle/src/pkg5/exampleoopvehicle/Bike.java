/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5.exampleoopvehicle;

/**
 *
 * @author jufeq
 */
public class Bike extends Vehicle {

    private int motorType; // 1: two times 2: four times

    public Bike() {
    }

    public Bike(int motorType, int year, String color, String brand, String model) {
        super(year, color, brand, model);
        this.motorType = motorType;
    }

    public int getMotorType() {
        return motorType;
    }

    public void setMotorType(int motorType) {
        this.motorType = motorType;
    }

    @Override
    public void shiftGears(GearEnum gearEnum, GearBox box) {
        if (box == GearBox.AUTOMATIC) {
            if (gearEnum == GearEnum.UP) {
                System.out.println("Bike: " + this.getBrand() + " BikeUp atomatic Gear");
            } else {
                System.out.println("Bike: " + this.getBrand() + " BikeDown atomatic Gear");
            }
        }else{
             if (gearEnum == GearEnum.UP) {
                System.out.println("Bike: " + this.getBrand() + " BikeUp manually Gear");
            } else {
                System.out.println("Bike: " + this.getBrand() + " BikeDown manually Gear");
            }
        }
    }
}
