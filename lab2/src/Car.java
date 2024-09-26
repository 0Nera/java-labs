public class Car {
    String model;
    String license;
    String color;
    static int year;

    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        Car.year = year;
    }

    public Car() {
        model = "car";
        license = "";
        color = "red";
        year = 2020;
    }

    public Car(String color, int year) {
        this.color = color;
        Car.year = year;
    }

    public String toString() {
        return "This is a car, model " + model + ", license " + license + ", color " + color + ", year " + year;
    }

    public void set_color(String color) {
        this.color = color;
    }

    public int get_diff_year(int current_year) {
        return current_year - year;
    }
}