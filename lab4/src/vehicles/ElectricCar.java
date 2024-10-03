package vehicles;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String model, String license, String color, int year, String ownerName, String insuranceNumber, int batteryCapacity) {
        super(model, license, color, year, ownerName, insuranceNumber);
        this.batteryCapacity = batteryCapacity;
        this.engineType = "Electric";
    }

    @Override
    public String vehicleType() {
        return "Electric Car";
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "{" +
                "\"model\":\"" + getModel() + "\"," +
                "\"license\":\"" + getLicense() + "\"," +
                "\"color\":\"" + getColor() + "\"," +
                "\"year\":" + getYear() + "," +
                "\"ownerName\":\"" + getOwnerName() + "\"," +
                "\"insuranceNumber\":\"" + getInsuranceNumber() + "\"," +
                "\"engineType\":\"" + getEngineType() + "\"," +
                "\"batteryCapacity\":" + batteryCapacity +
                "}";
    }
}