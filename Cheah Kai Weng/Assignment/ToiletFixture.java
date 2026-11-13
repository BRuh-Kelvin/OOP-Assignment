package Assignment;

public class ToiletFixture extends WaterFixture {
    //Variables in ToiletFixture
    private double waterUsageEachFlush;
    private int numberOfFlushes;

    //Constructor, WaterFixture object creation with name, water flow rate and shower time
    public ToiletFixture(String givenName, double givenWUEF, int givenNOF) {
        super(givenName); //Pass value to the constructor in WaterFixture
        waterUsageEachFlush = givenWUEF;
        numberOfFlushes = givenNOF;
    }

    //Object's method of getting water usage for each flush
    public double getWaterUsageEachFlush() {
        return waterUsageEachFlush;
    }

    //Object's method of getting number of flushes
    public double getNumberOfFlushes() {
        return numberOfFlushes;
    }

    //Object's method of setting water usage for each flush
    public void setWaterUsageEachFlush(double givenWaterUsageEachFlush) {
        waterUsageEachFlush = givenWaterUsageEachFlush;
    }

    //Object's method of setting shower time
    public void setNumberOfFlushes(int givenNumberOfFlushes) {
        numberOfFlushes = givenNumberOfFlushes;
    }

    //Water usage calculation
    @Override
    public double calculateWaterUsage() {
        return waterUsageEachFlush *numberOfFlushes;
    }

    //?
}
