package vehicles;

public class car {
    private String owner_name;
    private String insurance_number;
    protected String engine_type;

    public String get_owner_name() {
        return owner_name;
    }

    public void set_owner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String get_insurance_number() {
        return insurance_number;
    }

    public void set_insurance_number(String insurance_number) {
        this.insurance_number = insurance_number;
    }

    public String get_engine_type() {
        return engine_type;
    }

    public void set_engine_type(String engine_type) {
        this.engine_type = engine_type;
    }
}