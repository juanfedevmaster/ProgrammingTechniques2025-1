/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.exampleoopvehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jufeq
 */
public class ExampleOOPVehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("=== Vehicle Menu ===");
            System.out.println("1. Create a new Car");
            System.out.println("2. Create a new Bike");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter vehicle type (1: Gas, 2: Hybrid, 3: Electric): ");
                    int vehicleType = scanner.nextInt();
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter color: ");
                    String color = scanner.nextLine();
                    System.out.print("Enter brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter model: ");
                    String model = scanner.nextLine();

                    Car car = new Car(vehicleType, year, color, brand, model);
                    vehicles.add(car);
                    System.out.println("Car created and added to the list!");
                    break;

                case 2:
                    System.out.print("Enter motor type (1: Two times, 2: Four times): ");
                    int motorType = scanner.nextInt();
                    System.out.print("Enter year: ");
                    year = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter color: ");
                    color = scanner.nextLine();
                    System.out.print("Enter brand: ");
                    brand = scanner.nextLine();
                    System.out.print("Enter model: ");
                    model = scanner.nextLine();

                    Bike bike = new Bike(motorType, year, color, brand, model);
                    vehicles.add(bike);
                    System.out.println("Bike created and added to the list!");
                    break;

                case 0:
                    System.out.println("Exiting the menu...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 0);

        System.out.println("\n=== List of Vehicles ===");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
