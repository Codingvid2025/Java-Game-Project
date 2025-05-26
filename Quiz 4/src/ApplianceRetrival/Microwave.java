package ApplianceRetrival;

public class Microwave implements Appliances, HeatingAppliance {
    private String brand;
    private int powerConsumption;
    private int warrantyPeriod;
    private int heatingPower;
    private String microwaveType;

    public Microwave(String brand, int powerConsumption, int warrantyPeriod) {
        this.brand = brand;
        this.powerConsumption = powerConsumption;
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public int getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    @Override
    public void setHeatingPower(int power) {
        this.heatingPower = power;
    }

    @Override
    public int getHeatingPower() {
        return heatingPower;
    }

    @Override
    public void setMicrowaveType(String type) {
        this.microwaveType = type;
    }

    @Override
    public String getMicrowaveType() {
        return microwaveType;
    }

    public void displayDetails() {
        System.out.println("Microwave - Brand: " + brand + ", Power: " + powerConsumption +
                "W, Warranty: " + warrantyPeriod + " years, Heating Power: " +
                heatingPower + "W, Type: " + microwaveType);
    }
}

