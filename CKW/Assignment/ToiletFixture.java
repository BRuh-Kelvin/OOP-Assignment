package CKW.Assignment;

public class ToiletFixture extends WaterFixture {
    // Variables in ToiletFixture
    private double waterUsageEachFlush;

    // Constructor, WaterFixture object creation with name, water usage each flush
    public ToiletFixture(String givenName, double givenWUEF) {
        super(givenName); // Pass value to the constructor in WaterFixture
        setWaterUsageEachFlush(givenWUEF);
    }

    // Default Constructor, WaterFixture object creation with ("Unknown", 0.0)
    // flush
    public ToiletFixture() {
        super("Unknown"); // Pass value to the constructor in WaterFixture
        waterUsageEachFlush = 0.0;
    }

    // Object's method of getting water usage for each flush
    public double getWaterUsageEachFlush() {
        return waterUsageEachFlush;
    }

    // Object's method of setting water usage for each flush
    public void setWaterUsageEachFlush(double givenWaterUsageEachFlush) {
        if (givenWaterUsageEachFlush < 0) {
            throw new IllegalArgumentException("Water usage cannot be negative");
        } else {
            waterUsageEachFlush = givenWaterUsageEachFlush;
        }
    }

    // Water usage calculation
    @Override
    public double calculateWaterUsage(double numberOfFlushes) {
        return waterUsageEachFlush * numberOfFlushes;
    }

    // Whole number requirement for calculateWaterUsage method
    @Override
    public boolean requiresWholeNumber() {
        return true;
    }
    // ?
}