package ApplianceRetrival;

public class Refrigerator implements Appliances, CoolingAppliance {
    private String brand;
    private int powerConsumption;
    private int warrantyPeriod;
    private int coolingCapacity;
    private int numberOfDoors;

    public Refrigerator(String brand, int powerConsumption, int warrantyPeriod) {
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
    public void setCoolingCapacity(int capacity) {
        this.coolingCapacity = capacity;
    }

    @Override
    public int getCoolingCapacity() {
        return coolingCapacity;
    }

    @Override
    public void setNumberOfDoors(int doors) {
        this.numberOfDoors = doors;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void displayDetails() {
        System.out.println("Refrigerator - Brand: " + brand + ", Power: " + powerConsumption +
                "W, Warranty: " + warrantyPeriod + " years, Cooling Capacity: " +
                coolingCapacity + "L, Doors: " + numberOfDoors);
    }
}

