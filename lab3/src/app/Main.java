package app;

import vehicles.car;
import vehicles.electric_car;

public class Main {
    public static void main(String[] args) {
        car vehicle = new car();
        vehicle.set_owner_name("Aren");
        vehicle.set_insurance_number("88005553535");
        vehicle.set_engine_type("Petrol");

        System.out.println("Vehicle Owner: " + vehicle.get_owner_name());
        System.out.println("Vehicle Insurance Number: " + vehicle.get_insurance_number());
        System.out.println("Vehicle Engine Type: " + vehicle.get_engine_type());

        electric_car electric_vehicle = new electric_car();
        electric_vehicle.set_owner_name("Cheburek");
        electric_vehicle.set_insurance_number("56345668");
        electric_vehicle.set_battery_capacity(97.33);

        System.out.println("Electric Vehicle Owner: " + electric_vehicle.get_owner_name());
        System.out.println("Electric Vehicle Insurance Number: " + electric_vehicle.get_insurance_number());
        System.out.println("Electric Vehicle Engine Type: " + electric_vehicle.get_engine_type());
        System.out.println("Electric Vehicle Battery Capacity: " + electric_vehicle.get_battery_capacity());
    }
}