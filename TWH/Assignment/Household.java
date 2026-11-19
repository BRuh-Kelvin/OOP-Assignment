package TWH.Assignment;
import java.time.LocalDate;
import java.util.ArrayList;

public class Household {
    // Create array lists for WaterFixture objects
    private ArrayList<WaterFixture> fixtures = new ArrayList<WaterFixture>();

    // Create array lists for WaterUsageRecord objects 
    // format records[ WaterUsageRecord obj1(WaterFixture obj, LocalDate obj, double litres),Record2(WaterFixture obj, LocalDate obj, double litres) ]
    // format WaterFixture obj( String givenName, double givenWFR from subclass, double givenST from subclass)
    private ArrayList<WaterUsageRecord> records = new ArrayList<WaterUsageRecord>();
    
    // Getter for list of household water fixtures
    public ArrayList<WaterFixture> getFixtureArrayList() {
        return fixtures;
    }

    // public WaterFixture getFixtureFromList(ArrayList<WaterFixture> waterFixtureList, int index){
    //     return waterFixtureList.get(index);
    // }

    // Getter for list of household water usage records
    public ArrayList<WaterUsageRecord> getRecordArrayList() {
        return records;
    }

    // Add fixture object to arraylist
    public void addFixture(WaterFixture fixture) {
        fixtures.add(fixture);
    }

    public WaterUsageRecord recordUsage(WaterFixture fixture, LocalDate date, double amount) {
        WaterUsageRecord record = new WaterUsageRecord(fixture, date, fixture.calculateWaterUsage(amount));
        records.add(record);
        return record;
    }

    public void displayRecords(ArrayList<WaterUsageRecord> recordArrayList){
        // Use for loop to iterate over each index in the recordList arraylist, where each index contains a WaterUsageRecord Object
        for (int i = 0; i < recordArrayList.size(); i++) {
        // Use ArrayList utilty method to obtain the WaterUsageRecord Objec
            WaterUsageRecord record = recordArrayList.get(i);
        // Use date getter of WaterUsageRecord Object
            System.out.println("Date: " + record.getDate());
        // Use fixture object getter of WaterUsageRecord Object. then use name getter of fixture object
            System.out.println("Fixture: " + record.getFixture().getName());
         // Use litres  getter of WaterUsageRecord Object. 
            System.out.println("Water Consumed: " + record.getLitres() + " L\n");
            }
        }

    public void displayFixtures(ArrayList<WaterFixture> fixtureArrayList){
        // Use for loop to iterate over each index in the fixtureArrayList, where each index contains a WaterFixture Object
        for (int i = 0; i < fixtureArrayList.size(); i++) {
        // Use ArrayList utilty method to obtain the WaterFixture Object
            WaterFixture fixture = fixtureArrayList.get(i);
        // Use name getter of WaterFixture Object
            System.out.printf("Fixture %d: %s \n", i+1, fixture.getName());
            }
        }
}
