package Assignment;

public class ApplianceFixture extends WaterFixture {
    // Variables in ApplianceFixture
    private double waterFlowRate;

    // Constructor, WaterFixture object creation with name, water flow rate
    public ApplianceFixture(String givenName, double givenWFR) {
        super(givenName); // Pass value to the constructor in WaterFixture
        waterFlowRate = givenWFR;
    }

    // Constructor, WaterFixture object creation with ("Unknown", 0.0)
    public ApplianceFixture() {
        super("Unknown"); // Pass value to the constructor in WaterFixture
        waterFlowRate = 0.0;
    }

    // Object's method of getting water flow rate
    public double getWaterFlowRate() {
        return waterFlowRate;
    }

    // Object's method of setting water flow rate
    public void setWaterFlowRate(double givenWaterFlowRate) {
        waterFlowRate = givenWaterFlowRate;
    }

    @Override
    public double calculateWaterUsage(double minute) {
        return waterFlowRate * minute;
    }

    // ?
}