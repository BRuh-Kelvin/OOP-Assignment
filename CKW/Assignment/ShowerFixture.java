package CKW.Assignment;

public class ShowerFixture extends WaterFixture {

    // Constructor, WaterFixture object creation with name, water flow rate
    public ShowerFixture(String givenName, double givenWFR) {
        super(givenName,givenWFR); // Pass value to the constructor in WaterFixture
    }

    // Default Constructor, WaterFixture object creation with ("Unknwon", 0.0)
    public ShowerFixture() {
        super("Unknown", 0.0); // Pass value to the constructor in WaterFixture
    }

    // Water usage calculation
    @Override
    public double calculateWaterUsage(double minute) {
        return getWaterUsageRate() * minute;
    }

    // Whole number requirement for calculateWaterUsage method
    @Override
    public boolean requiresWholeNumber() {
        return false;
    }
    // ?
}