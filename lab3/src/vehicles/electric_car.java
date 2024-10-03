package vehicles;

public class electric_car extends car {
    private double battery_capacity;

    public electric_car() {
        this.engine_type = "Electric";
    }

    // Геттер для battery_capacity
    public double get_battery_capacity() {
        return battery_capacity;
    }

    // Сеттер для battery_capacity
    public void set_battery_capacity(double battery_capacity) {
        this.battery_capacity = battery_capacity;
    }
}