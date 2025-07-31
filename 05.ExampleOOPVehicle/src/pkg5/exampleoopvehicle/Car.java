/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5.exampleoopvehicle;

/**
 *
 * @author jufeq
 */
public class Car extends Vehicle {

    private int vehicleType; // 1: Gas - 2: Hybrid - 3: Electric 

    public Car() {
    }

    public Car(int vehicleType, int year, String color, String brand, String model) {
        super(year, color, brand, model);
        this.vehicleType = vehicleType;
    }

    public int getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(int vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public void shiftGears(GearEnum gearEnum, GearBox box) {
        if (box == GearBox.AUTOMATIC) {
            if (gearEnum == GearEnum.UP) {
                System.out.println("Car: " + this.getBrand() + " BikeUp atomatic Gear");
            } else {
                System.out.println("Car: " + this.getBrand() + " BikeDown atomatic Gear");
            }
        } else {
            if (gearEnum == GearEnum.UP) {
                System.out.println("Car: " + this.getBrand() + " BikeUp manually Gear");
            } else {
                System.out.println("Car: " + this.getBrand() + " BikeDown manually Gear");
            }
        }
    }
}
