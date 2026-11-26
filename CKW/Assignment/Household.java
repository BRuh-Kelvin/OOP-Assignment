package CKW.Assignment;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

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
    // amount is based on each water fixture, if int prb need to truncate or handle coversion
    public void recordUsage(WaterFixture fixture, LocalDate date, double amount) {
        // Rejects negative usage amounts
        if (amount <= 0) {
            throw new IllegalArgumentException("Usage must be greater than zero.");   
        } 
        // Checks if the fixture uses whole integers, if yes, reject any non-whole number input
        if (fixture.requiresWholeNumber() && amount != Math.floor(amount)) {
            throw new IllegalArgumentException(fixture.getName() + " usage must be a whole number.");   
        } 

        WaterUsageRecord record = new WaterUsageRecord(fixture, date, fixture.calculateWaterUsage(amount));
        records.add(record);
        // sort records based on date
        records.sort(Comparator.comparing(WaterUsageRecord::getDate));
    }


    public void displayRecords(){
        System.out.println("=================================================");
        System.out.println("============== Water Usage Records ==============");
        System.out.println("=================================================");

        System.out.println("   Date    ||       Fixture      ||   Usage (L)   ");
        // Use for loop to iterate over each index in the recordList arraylist, where each index contains a WaterUsageRecord Object
        // for (int i = 0; i < records.size(); i++) {
        for (WaterUsageRecord record : records){
        // Use ArrayList utilty method to obtain the WaterUsageRecord Objec
            // WaterUsageRecord record = records.get(i);
        // Use date getter of WaterUsageRecord Object
        // Use fixture object getter of WaterUsageRecord Object. then use name getter of fixture object
        // Use litres  getter of WaterUsageRecord Object. 
            System.out.printf("%-10s || %-18s || %-10.2f \n", record.getDate(), record.getFixture().getName(),record.getLitres());
            }
        System.out.println("=================================================");
        System.out.println("");
        }

        // possible need to extract flow rate here as well
    public void displayFixtures(){
        System.out.println("");
        System.out.println("===== All Fixtures =====");
        // Use for loop to iterate over each index in the fixtureArrayList, where each index contains a WaterFixture Object
        for (int i = 0; i < fixtures.size(); i++) {
        // Use ArrayList utilty method to obtain the WaterFixture Object
            WaterFixture fixture = fixtures.get(i);
        // Use name getter of WaterFixture Object
            System.out.printf("Fixture %d: %s  \n", i+1, fixture.getName());
            }
        System.out.println("");
        }

    // Actually this is Hao Yan's part no
    public void waterUsageReport(){

        System.out.println("==== Monthly Water Report ====");

        for (WaterFixture fixture : fixtures){
            double fixtureUsage = 0;   
            for (WaterUsageRecord record : records) {         
                if (record.getFixture() == fixture){
                    fixtureUsage += record.getLitres();
                }
            }
            System.out.printf("%-10s : %5.2f L \n", fixture.getName(), fixtureUsage);

        }
        //// Other details add on pls Haoyan
        System.out.println("");

    }

    // can be deleted if not used
     public double getWaterUsagePerFixture(WaterFixture fixture){
        double fixtureUsage = 0;
        for (WaterUsageRecord record : records) {            
            if (record.getFixture() == fixture){
                fixtureUsage += record.getLitres();
            }
        }
        return fixtureUsage;
    }
}
