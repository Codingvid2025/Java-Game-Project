package ApplianceRetrival;

public class WashingMachine implements Appliances, WashingAppliance {
    private String brand;
    private int powerConsumption;
    private int warrantyPeriod;
    private double drumSize;
    private String type;

    public WashingMachine(String brand, int powerConsumption, int warrantyPeriod) {
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
    public void setDrumSize(double drumSize) {
        this.drumSize = drumSize;
    }

    @Override
    public double getDrumSize() {
        return drumSize;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    public void displayDetails() {
        System.out.println("Washing Machine - Brand: " + brand + ", Power: " + powerConsumption +
                "W, Warranty: " + warrantyPeriod + " years, Drum Size: " + drumSize +
                " kg, Type: " + type);
    }
}

