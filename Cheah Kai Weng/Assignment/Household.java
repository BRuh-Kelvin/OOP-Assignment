package Assignment;
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
    public ArrayList<WaterFixture> getFixtures() {
        return fixtures;
    }

    // Getter for list of household water usage records
    public ArrayList<WaterUsageRecord> getRecords() {
        return records;
    }

    // Add fixture object to arraylist
    public void addFixture(WaterFixture fixture) {
        fixtures.add(fixture);
    }

    public WaterUsageRecord recordUsage(WaterFixture fixture, LocalDate date) {
        WaterUsageRecord record = new WaterUsageRecord(fixture, date, fixture.calculateWaterUsage());
        records.add(record);
        return record;
    }
}
