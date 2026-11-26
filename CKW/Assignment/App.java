package CKW.Assignment;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args)
    {
        Household household = new Household();
        Scanner input = new Scanner(System.in);
        ArrayList<WaterFixture> fixtureArrayList = household.getFixtureArrayList();
        int option = 0;

        outerloop:
        while (true) {
            System.out.println("Water Usage Tracker App");
            System.out.println("1. Add fixtures");
            System.out.println("2. Record water usage");
            System.out.println("3. View total consumption and estimated cost");
            System.out.println("4. Show high-consumption fixtures and saving tips ");
            System.out.println("5. Exit App");
            System.out.print("(Option 1-5): ");


            option = Integer.parseInt(input.nextLine());
            System.out.println("");

            switch (option) {
                case 1:
                    addFixtureProcess(household, fixtureArrayList, input);
                break;
                case 2:
                    // Record water usage
                    recordUsageProcess(household, fixtureArrayList, input);
                    break;
                case 3:
                    // View total consumption and estimated cost 
                case 4:
                    // Show high-consumption fixtures and saving tips 
                    break;
                case 5:
                    // Exit while loop
                    break outerloop;
                default:
                    System.out.println("Invalid Option! Please try again.");
                    break;
            };
        }
    input.close();
    }

    public static void addFixtureProcess(Household household, ArrayList<WaterFixture> fixtureArrayList, Scanner input) {
        // Add fixtures (probably and inner case switch of if else gate to choose what type of fixture) or links to a method
        int inputFixture = 0;
        WaterFixture fixture;
        System.out.println("1. Shower");
        System.out.println("2. Toilet");
        System.out.println("3. General Water Appliance (Whole number usage)");
        System.out.print("Choose Type of Water Fixture to add. (1-3): ");

        try{
            inputFixture = Integer.parseInt(input.nextLine());
            System.out.print("Enter Name: ");
            String name = input.nextLine().trim();
            System.out.print("Enter water usage rate (L/unit): ");
            double usageRate = 0;
            usageRate = Double.parseDouble(input.nextLine());

            switch(inputFixture){
                case 1:
                    fixture = new ShowerFixture(name, usageRate);
                    System.out.println("Shower Fixture created:" + fixture.getName() + " " + fixture.getWaterUsage());
                    household.addFixture(fixture);
                    break;

                case 2:
                    fixture = new ToiletFixture(name, usageRate);
                    System.out.println("Toilet Fixture created:" + fixture.getName() + " " + fixture.getWaterUsage());
                    household.addFixture(fixture);
                    break;

                case 3:
                    fixture = new ApplianceFixture(name, usageRate);
                    System.out.println("Appliancne Fixture created:" + fixture.getName() + " " + fixture.getWaterUsage());
                    household.addFixture(fixture);
                    break;
                default:
                    System.out.println("Invalid Option! Please try again.");
                    break;
            }
            System.out.println("");
            household.displayFixtures();

        } catch (NumberFormatException e) {
            System.out.println("Please enter a number.");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }


    public static void recordUsageProcess(Household household, ArrayList<WaterFixture> fixtureArrayList, Scanner input) {
        // Display fixture list
 
        if (fixtureArrayList.isEmpty()) {
            System.out.println("No fixtures registered. Add one first.");
        } 
        else {
            System.out.println("Select a fixture:");
            household.displayFixtures();
        }
        while(true){
            // Use try... catch to handle errors so the program does not crash
            try{
                System.out.print("Select Fixture: ");
                int fixtureIndex = Integer.parseInt(input.nextLine()); // use nextLine so that \n newlince charecter is consumed, then parse for int

                // Parse the user's input string into a LocalDate object
                System.out.print("Enter usage date (YYYY-MM-DD): ");
                LocalDate date = LocalDate.parse(input.nextLine());

                // Get usage amount from user
                System.out.print("Enter usage: ");
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