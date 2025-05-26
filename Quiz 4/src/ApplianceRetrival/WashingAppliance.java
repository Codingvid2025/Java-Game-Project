package ApplianceRetrival;
public interface WashingAppliance {
    void setDrumSize(double drumSize);
    double getDrumSize();
    void setType(String type); // "Front-load" or "Top-load"
    String getType();
}
