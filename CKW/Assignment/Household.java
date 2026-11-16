package CKW.Assignment;
import java.time.LocalDate;
import java.util.ArrayList;

public class Household {

    // Create array lists for WaterFixture objects
    private ArrayList<WaterFixture> fixtures = new ArrayList<WaterFixture>();

    // Create array lists for WaterUsageRecord objects 
    // format records[ WaterUsageRecord obj1(WaterFixture obj, LocalDate obj, double litres),Record2(WaterFixture obj, LocalDate obj, double litres) ]
    // format WaterFixture obj( String givenName, double givenWFR from subclass)
    private ArrayList<WaterUsageRecord> records = new ArrayList<WaterUsageRecord>();
    

    // Default Constructor
    public Household() {
    }

    // Getter for list of household water fixtures
    public ArrayList<WaterFixture> getFixtureArrayList() {
        return fixtures;
    }

    // Getter for list of household water usage records
    public ArrayList<WaterUsageRecord> getRecordArrayList() {
        return records;
    }

    // Add fixture object to arraylist
    public void addFixture(WaterFixture fixture) {
        fixtures.add(fixture);
    }

    // Add  WaterUsageRecord object to arraylist
    public void recordUsage(WaterFixture fixture, LocalDate date, double amount) {
        WaterUsageRecord record = new WaterUsageRecord(fixture, date, fixture.calculateWaterUsage(amount));
        records.add(record);
    }

    public void displayRecords(){
        // Use for loop to iterate over each index in the recordList arraylist, where each index contains a WaterUsageRecord Object
        for (int i = 0; i < this.records.size(); i++) {
        // Use ArrayList utilty method to obtain the WaterUsageRecord Objec
            WaterUsageRecord record = records.get(i);
        // Use date getter of WaterUsageRecord Object
            System.out.println("Date: " + record.getDate());
        // Use fixture object getter of WaterUsageRecord Object. then use name getter of fixture object
            System.out.println("Fixture: " + record.getFixture().getName());
         // Use litres  getter of WaterUsageRecord Object. 
            System.out.println("Water Consumed: " + record.getLitres() + " L\n");
            }
        }

        // possible need to extract flow rate here as well
    public void displayFixtures(){
        System.out.println("");
        System.out.println("Fixture List:");
        // Use for loop to iterate over each index in the fixtureArrayList, where each index contains a WaterFixture Object
        for (int i = 0; i < fixtures.size(); i++) {
        // Use ArrayList utilty method to obtain the WaterFixture Object
            WaterFixture fixture = fixtures.get(i);
        // Use name getter of WaterFixture Object
            System.out.printf("Fixture %d: %s,  \n", i+1, fixture.getName());
            }
             System.out.println("");

        }

}
