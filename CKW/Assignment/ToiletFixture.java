package CKW.Assignment;

public class ToiletFixture extends WaterFixture {
    // Variables in ToiletFixture

    // Constructor, WaterFixture object creation with name, water usage each flush
    public ToiletFixture(String givenName, double givenWUEF) {
        super(givenName, givenWUEF); // Pass value to the constructor in WaterFixture
    }

    // Default Constructor, WaterFixture object creation with ("Unknown", 0.0)
    public ToiletFixture() {
        super("Unknown", 0.0); // Pass value to the constructor in WaterFixture
    }

    // Water usage calculation
    @Override
    public double calculateWaterUsage(double numberOfFlushes) {
        return getWaterUsageRate() * numberOfFlushes;
    }

    // Whole number requirement for calculateWaterUsage method
    @Override
    public boolean requiresWholeNumber() {
        return true;
    }
    // ?
}