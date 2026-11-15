package Assignment;
import java.security.cert.TrustAnchor;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class Testing {
    public static void main(String[] args)
    {
        Household household = new Household();
        Scanner input = new Scanner(System.in);
        ArrayList<WaterFixture> fixtureArrayList = household.getFixtureArrayList();
        String option = "";

        outerloop:
        while (true) {
            System.out.println("Water Usage Tracker App (Option 1-5)");
            option = input.nextLine();
            input.nextLine(); // consume leftover newline
            switch (option) {
                case "1":
                    // Add fixtures (probably and inner case switch of if else gate to choose what type of fixture) or links to a method
                    String inputFixture = "";
                    System.out.println("Choose Type of Water Fixture to add. (1-3)");
                    System.out.println("1. Shower");
                    System.out.println("2. Toilet");
                    inputFixture = input.nextLine();
                    input.nextLine(); // consume leftover newline
                    switch(inputFixture){
                        case "1":
                            System.out.print("Enter Name: ");
                            String name = input.nextLine();

                            System.out.print("Enter water flow rate (L/min): ");
                            double flowRate = input.nextDouble();

                            System.out.print("Enter shower time (min): ");
                            double showerTime = input.nextDouble();
                            WaterFixture fixture = new ShowerFixture(name, flowRate, showerTime);
                            System.out.println("Fixture created:" + fixture.getName() + " " + ((ShowerFixture)fixture).getShowerTime() + " " + ((ShowerFixture)fixture).getWaterFlowRate());
                            household.addFixture(fixture);

                            break;
                        case "2":
                            // Fixture 2
                            break;
                        case "3":
                            // Fixture 3
                    }
                    break;
                case "2":
                    // Record water usage





                    if (fixtureArrayList.isEmpty()) {
                        System.out.println("No fixtures registered. Add one first.");
                    } else {
                        System.out.println("Select a fixture:");
                        for (int i = 0; i < fixtureArrayList.size(); i++) {
                            System.out.println((i + 1) + ". " + fixtureArrayList.get(i).getName());
                        }

                    int fixtureIndex = input.nextInt();
                    // how do i pass into recordUsage


                    // Get usage date from user
                    System.out.print("Enter usage date (YYYY-MM-DD): ");
                    String dateInput = input.nextLine();
                    
                    // Parse the user's input string into a LocalDate object
                    LocalDate date = LocalDate.parse(dateInput); 
                    // Create record from 

                    System.out.print("Enter shower time (min): ");
                    double showerTime = input.nextDouble();
                    household.recordUsage(fixtureArrayList.get(fixtureIndex), date,  fixtureArrayList.get(fixtureIndex).calculateWaterUsage(showerTime)); // how to 


                    System.out.println("===== All Water Usage Records =====");
                    // Use getter to obtain record list from household obj
                    ArrayList<WaterUsageRecord> recordList = household.getRecordArrayList();
                    break;
                case "3":
                    // View total consumption and estimated cost 
                case "4":
                    // Show high-consumption fixtures and saving tips 
                    break;
                case "5":
                    // Exit while loop
                    break outerloop;
                default:
                    System.out.println("Invalid Option! Please try again.");
                    break;
            };
        }


        // display fixture list
        household.displayFixtures(fixtureArrayList);




        input.nextLine(); // consume leftover newline
       
        
        // Call method to show all records from a the record arraylist
        household.displayRecords(recordList);
       
        input.close();
    }
}
