/*This program shows the use of Polymorphism where the user creates multiple instances
that reuse the same code in the Super class, but with their own characteristics, therefore,
the vehicle class takes many forms based on the instances ran through it.

This program also employs the use of user input, while loop, .contains() String method,
substring() String methods, OOP, Switch used as expression, Inheritance, and method overriding.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //##Testcase 1:
        Vehicle vehicle1 = new Vehicle("Toyota Landcruiser");
        vehicle1.driveCar();
        System.out.println("================");

        //##Tastcase 2:
        Vehicle vehicle2 = new Offroad("Toyota Tacoma");//Offroad is part of Vehicle
        vehicle2.driveCar();
        System.out.println("================");

        //**Testcase 3:
        Vehicle vehicle3 = new Family("Toyota Siena");
        vehicle3.driveCar();
        System.out.println("================");

        //**Testcase 4:
        Vehicle vehicle4 = new Emergency("Fire Truck");
        vehicle4.driveCar();
        System.out.println("================");

        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.print("Select vehicle TYPE:\n" +
                    "1. O for Offroad\n" +
                    "2. F for Family\n" +
                    "3. E for Emergency\n" +
                    "4. Q to quit\n" +
                    "Input: ");
            String vehicleType = keyboard.nextLine();
            if ("Qq".contains(vehicleType)) {
                break;
            }
            System.out.print("Enter Vehicle name: ");
            String vehicleName = keyboard.nextLine();
            Vehicle vehicle = Vehicle.setVehicleType(vehicleType, vehicleName);
            vehicle.driveCar();
        }
    }
}
