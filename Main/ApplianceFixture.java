package Main;

public class ApplianceFixture extends WaterFixture {
    // Variables in ApplianceFixture
    private double waterFlowRate;

    // Constructor, WaterFixture object creation with name, water flow rate
    public ApplianceFixture(String givenName, double givenWFR) {
        super(givenName); // Pass value to the constructor in WaterFixture
        setWaterUsage(givenWFR);
    }

    // Constructor, WaterFixture object creation with ("Unknown", 0.0)
    public ApplianceFixture() {
        super("Unknown"); // Pass value to the constructor in WaterFixture
        waterFlowRate = 0.0;
    }

    // Object's method of getting water flow rate
    @Override
    public double getWaterUsage() {
        return waterFlowRate;
    }

    // Object's method of setting water flow rate
    @Override
    public void setWaterUsage(double givenWaterUsage) {
        if (givenWaterUsage < 0) {
            throw new IllegalArgumentException("Water flow rate cannot be negative");
        } else {
            waterFlowRate = givenWaterUsage;
        }
    }

    // Water usage calculation
    @Override
    public double calculateWaterUsage(double minute) {
        return waterFlowRate * minute;
    }

    // Whole number requirement for calculateWaterUsage method
    @Override
    public boolean requiresWholeNumber() {
        return true;
    }
    // ?
}