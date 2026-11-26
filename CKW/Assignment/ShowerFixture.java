package CKW.Assignment;

public class ShowerFixture extends WaterFixture {
    // Variables in ShowerFixture
    private double waterFlowRate;

    // Constructor, WaterFixture object creation with name, water flow rate
    public ShowerFixture(String givenName, double givenWFR) {
        super(givenName); // Pass value to the constructor in WaterFixture
        setWaterUsage(givenWFR);
    }

    // Default Constructor, WaterFixture object creation with ("Unknwon", 0.0)
    public ShowerFixture() {
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
        if (givenWaterUsage <= 0) {
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
        return false;
    }
    // ?
}