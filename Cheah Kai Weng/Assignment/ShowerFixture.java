package Assignment;

public class ShowerFixture extends WaterFixture{
    //Variables in ShowerFixture
    private double waterFlowRate;
    private double showerTime;

    //Constructor, WaterFixture object creation with name, water flow rate and shower time
    public ShowerFixture(String givenName, double givenWFR, double givenST) {
        super(givenName); //Pass value to the constructor in WaterFixture
        waterFlowRate = givenWFR;
    }

    //Object's method of getting water flow rate
    public double getWaterFlowRate() {
        return waterFlowRate;
    }


    //Object's method of setting water flow rate
    public void setWaterFlowRate(double givenWaterFlowRate) {
        waterFlowRate = givenWaterFlowRate;
    }

    //Water usage calculation
    @Override
    public double calculateWaterUsage(double minute) {
        return waterFlowRate * minute;
    }

    //?
}
