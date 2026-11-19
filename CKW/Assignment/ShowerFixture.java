package CKW.Assignment;

public class ShowerFixture extends WaterFixture {
    // Variables in ShowerFixture
    private double waterFlowRate;
    // possibly a variable for total water usage, but not needed since it can be calculated with the method


    // Constructor, WaterFixture object creation with name, water flow rate
    public ShowerFixture(String givenName, double givenWFR) {
        super(givenName); // Pass value to the constructor in WaterFixture
        waterFlowRate = givenWFR;
    }

    // Default Constructor, WaterFixture object creation with ("Unknwon", 0.0)
    public ShowerFixture() {
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

    // Water usage calculation
    @Override
    public double calculateWaterUsage(double minute) {
        return waterFlowRate * minute;
    }

    // ?
}