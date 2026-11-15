package Assignment;

public class ToiletFixture extends WaterFixture {
    // Variables in ToiletFixture
    private double waterUsageEachFlush;

    // Constructor, WaterFixture object creation with name, water flow rate and
    // shower time
    public ToiletFixture(String givenName, double givenWUEF) {
        super(givenName); // Pass value to the constructor in WaterFixture
        waterUsageEachFlush = givenWUEF;
    }

    // Object's method of getting water usage for each flush
    public double getWaterUsageEachFlush() {
        return waterUsageEachFlush;
    }

    // Object's method of setting water usage for each flush
    public void setWaterUsageEachFlush(double givenWaterUsageEachFlush) {
        waterUsageEachFlush = givenWaterUsageEachFlush;
    }

    // Water usage calculation
    @Override
    public double calculateToiletUsage(int numberOfFlushes) {
        return waterUsageEachFlush * numberOfFlushes;
    }

    // ?
}