package CKW.Assignment;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeParseException; // To catch exceptions of incorrect usage date inputs

public class Testing {
    public static void main(String[] args)
    {
        Household household = new Household();
        Scanner input = new Scanner(System.in);
        ArrayList<WaterFixture> fixtureArrayList = household.getFixtureArrayList();

        // should prb be a method in main
        WaterFixture fixture = new ShowerFixture("Shower 1", 12);
        WaterFixture fixture1 = new ToiletFixture("Toilet 1", 22);
        WaterFixture fixture2 = new ApplianceFixture("Appliance 1", 11);

        household.addFixture(fixture);
        household.addFixture(fixture1);
        household.addFixture(fixture2);


        // Call this method to actually record using user input
        //recordUsageProcess(household, fixtureArrayList, input);

        // Hardcoding for testing
        household.recordUsage(fixture, LocalDate.parse("2026-11-30"),  22.2);
        household.recordUsage(fixture, LocalDate.parse("2026-11-21"),  22.2);
        household.recordUsage(fixture1, LocalDate.parse("2026-11-23"),  1);
        household.recordUsage(fixture1, LocalDate.parse("2026-11-25"),  2);
        household.recordUsage(fixture2, LocalDate.parse("2026-11-16"),  5);
        household.recordUsage(fixture2, LocalDate.parse("2026-11-27"),  26);

        household.displayFixtures();
        household.displayRecords();   
        household.waterUsageReport();   
        System.out.printf("Individual fixture usage of Appliance 1: %.2f L", household.getWaterUsagePerFixture(fixture2));
        input.close();
    }


    public static void recordUsageProcess(Household household, ArrayList<WaterFixture> fixtureArrayList, Scanner input) {
        // Display fixture list
        System.out.print("===== All Fixtures =====");
        household.displayFixtures();
    
        // Display fixture objects recorded in fixture ArrayList for users to choose (deprecated)
        // System.out.print("Select a fixture:");
        //     for (int i = 0; i < fixtureArrayList.size(); i++) {
        //         System.out.printf("%d. %s ",(i + 1), fixtureArrayList.get(i).getName());
        //     }

        System.out.println("");
        while(true){
            // Use try... catch to handle errors so the program does not crash
            try{
                System.out.print("Select Fixture: ");
                int fixtureIndex = Integer.parseInt(input.nextLine()); // use nextLine so that \n newlince charecter is consumed, then parse for int

                // Parse the user's input string into a LocalDate object
                System.out.print("Enter usage date (YYYY-MM-DD): ");
                LocalDate date = LocalDate.parse(input.nextLine());

                // Get usage amount from user
                System.out.print("Enter usage (double): ");
                double usage = Double.parseDouble(input.nextLine());

                // Create record object for the selected water fixture object, with date, and using the selected water fixture object to calculate litres used
                household.recordUsage(fixtureArrayList.get(fixtureIndex-1), date,  usage);

                System.out.println("");
                break; // only reached if nothing above threw an exception
            } 
            // Exception for invalid non-integer inputs when selecting fixture objects from the fixture ArrayList
            catch (NumberFormatException e) {
                System.out.println("Please enter an Integer to select the fixture.");
            }  
            // Exception for invalid input of  usage date of type LocalDate (YYYY-MM-DD)
            catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please follow the YYYY-MM-DD format closely with the dashes.");
            } 
            // Exception for selection of fixture that is out of bounds or not in the fixture ArrayList.
            catch (IndexOutOfBoundsException e) {
                System.out.println("That selected fixture does not exist as a recorded fixture. Try adding it as a fixture first.");
            } 
            // Exception for invalid input of negative litres, exception is thrown fro the WaterUsageRecord setLitres method
            // Future exceptions for other errors
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
