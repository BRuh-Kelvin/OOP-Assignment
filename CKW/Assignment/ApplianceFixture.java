package CKW.Assignment;

public class ApplianceFixture extends WaterFixture {
    // Variables in ApplianceFixture
    private double waterFlowRate;

    // Constructor, WaterFixture object creation with name, water flow rate
    public ApplianceFixture(String givenName, double givenWFR) {
        super(givenName,givenWFR); // Pass value to the constructor in WaterFixture
    }

    // Constructor, WaterFixture object creation with ("Unknown", 0.0)
    public ApplianceFixture() {
        super("Unknown",0.0); // Pass value to the constructor in WaterFixture
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