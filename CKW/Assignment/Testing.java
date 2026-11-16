package CKW.Assignment;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class Testing {
    public static void main(String[] args)
    {
        Household household = new Household();
        Scanner input = new Scanner(System.in);
        ArrayList<WaterFixture> fixtureArrayList = household.getFixtureArrayList();

        // should prb be a method in main
        WaterFixture fixture = new ShowerFixture("Shower 1", 12);
        WaterFixture fixture1 = new ShowerFixture("Shower 2", 22);
        WaterFixture fixture2 = new ShowerFixture("Shower 3", 11);

        household.addFixture(fixture);
        household.addFixture(fixture1);
        household.addFixture(fixture2);

        // display fixture list
        household.displayFixtures(fixtureArrayList);
    
        System.out.println("Select a fixture:");
            for (int i = 0; i < fixtureArrayList.size(); i++) {
                System.out.println((i + 1) + ". " + fixtureArrayList.get(i).getName());
            }
        System.out.println("");

        int fixtureIndex = input.nextInt();
        input.nextLine(); // consume leftover newline

        // Get usage date from user. I need to handle errors here, or process input to be accepeted even tho not exact form
        System.out.print("Enter usage date (YYYY-MM-DD): ");
        String dateInput = input.nextLine();
                    
        // Parse the user's input string into a LocalDate object
        LocalDate date = LocalDate.parse(dateInput); 

        // Get usage time from user
        System.out.print("Enter usage (double): ");
        double usage = input.nextDouble();

        // Create record object for the selected water fixture object, with date, and using the selected water fixture object to calculate litres used
        household.recordUsage(fixtureArrayList.get(fixtureIndex-1), date,  fixtureArrayList.get(fixtureIndex).calculateWaterUsage(usage));

        System.out.println("===== All Water Usage Records =====");
        // Use getter to obtain record list from household obj
        ArrayList<WaterUsageRecord> recordList = household.getRecordArrayList();
        household.displayRecords(recordList);   

        System.out.println("===== All Fixtures =====");
        // Use getter to obtain record list from household obj
        ArrayList<WaterFixture> fixtureList = household.getFixtureArrayList();
        household.displayFixtures(fixtureList);   


        input.close();
    }
}
