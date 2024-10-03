package app;

import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Bugatti", "XYZ789", "Blue", 2022, "Alice Johnson", "INS54321");
        Vehicle electricCar = new ElectricCar("Tesla Model S", "ABC123", "White", 2021, "Bob Brown", "INS98765", 120);

        car.setColor("Black");
        electricCar.setOwnerName("Charlie Davis");

        System.out.println(car);
        System.out.println(electricCar);
    }
}