package TWH.Assignment;

public class WaterFixture {
    // Variable in WaterFixture
    private String name;

    // Constructor, WaterFixture object creation with name
    public WaterFixture(String givenName) {
        setName(givenName);
    }

    // Default Constructor, WaterFixture object creation with "Unknown"
    public WaterFixture() {
        name = "Unknown";
    }

    // Object's method of getting water usage
    public double getWaterUsage() {
        return 0;
    }

    // Object's method of setting water usage
    public void setWaterUsage(double givenWaterUsage) {

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

    // Water usage calculation
    public double calculateWaterUsage(double amount) {
        return 0;
    };

    // Whole number requirement for calculateWaterUsage method
    public boolean requiresWholeNumber() {
        return true;
    }

    // Saving tips
    public void savingTips() {

    }
}