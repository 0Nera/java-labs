package vehicles;

public class Car extends Vehicle {
    public Car(String model, String license, String color, int year, String ownerName, String insuranceNumber) {
        this.setModel(model);
        this.setLicense(license);
        this.setColor(color);
        this.setYear(year);
        this.setOwnerName(ownerName);
        this.setInsuranceNumber(insuranceNumber);
        this.engineType = "Internal Combustion";
    }

    @Override
    public String vehicleType() {
        return "Car";
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
                "\"engineType\":\"" + getEngineType() + "\"" +
                "}";
    }
}