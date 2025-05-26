package ApplianceRetrival;

public interface HeatingAppliance {
    void setHeatingPower(int power);
    int getHeatingPower();
    void setMicrowaveType(String type); // "Convection", "Grill", or "Solo"
    String getMicrowaveType();
}

