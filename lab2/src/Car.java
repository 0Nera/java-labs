public class Car {
    String model;
    String license;
    String color;
    int year;

    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    public Car() {
        model = "car";
        license = "unknown";
        color = "red";
        year = 2020;
    }

    public Car(String color, int year) {
        this.color = color;
        this.year = year;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}