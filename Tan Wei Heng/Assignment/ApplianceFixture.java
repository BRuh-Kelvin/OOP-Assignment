package Assignment;

public class ApplianceFixture extends WaterFixture {
    // Variables in ApplianceFixture
    private double waterFlowRate;

    // Constructor, WaterFixture object creation with name, water flow rate and
    // shower time
    public ApplianceFixture(String givenName, double givenWFR) {
        super(givenName); // Pass value to the constructor in WaterFixture
        waterFlowRate = givenWFR;
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