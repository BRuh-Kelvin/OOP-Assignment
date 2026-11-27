package CKW.Assignment;

public class WaterFixture {
    // Variable in WaterFixture
    private String name;
    private double waterUsageRate;

    // Constructor, WaterFixture object creation with name
    public WaterFixture(String givenName,double givenWaterUsageRate) {
        setName(givenName);
        setWaterUsageRate(givenWaterUsageRate);
    }

    // Default Constructor, WaterFixture object creation with "Unknown"
    public WaterFixture() {
        name = "Unknown";
        waterUsageRate = 0;
    }

    // Object's method of getting water usage
    public double getWaterUsageRate() {
        return waterUsageRate;
    }

    // Object's method of setting water usage
    public void setWaterUsageRate(double givenWaterUsageRate) {
        if (givenWaterUsageRate < 0) {
            throw new IllegalArgumentException("Water usage cannot be negative");
        } 
        waterUsageRate = givenWaterUsageRate;
    }

    // Object's method of getting a name
    public String getName() {
        return name;
    }

    // Ensure valid names are entered
    public void setName(String enteredName) {
        if (enteredName == null) {
            throw new IllegalArgumentException("Fixture name cannot be empty");
        } else {
            name = enteredName;
        }
    }

    // Water usage calculation (For ShowerFixture and ApplianceFixture)
    public double calculateWaterUsage(double amount) {
        return 0;
    };

    // Whole number requirement for calculateWaterUsage method
    public boolean requiresWholeNumber() {
        return true;
    }
    // ?
}