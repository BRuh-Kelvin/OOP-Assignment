package Assignment;

public class WaterFixture {
    //Variable in WaterFixture
    private String name;

    //Constructor, WaterFixture object creation with name
    public WaterFixture(String givenName) {
        setName(givenName);
    }

    //Object's method of getting a name
    public String getName(){
        return name;
    }

    //Ensure valid names are entered
    public void setName(String enteredName){
            name = enteredName;
    }

    //Water usage calculation
    public double calculateWaterUsage() {
        return 0;
    };

    //?
}
