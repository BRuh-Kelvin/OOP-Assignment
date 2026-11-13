package Assignment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;



public class Testing {
    public static void main(String[] args)
    {
        Household household = new Household();

        Scanner input = new Scanner(System.in);
        

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter water flow rate (L/min): ");
        double flowRate = input.nextDouble();

        System.out.print("Enter shower time (min): ");
        double showerTime = input.nextDouble();

        WaterFixture fixture = new ShowerFixture(name, flowRate, showerTime);
        System.out.println(fixture.getName() + " " + ((ShowerFixture)fixture).getShowerTime() + " " + ((ShowerFixture)fixture).getWaterFlowRate());

        input.nextLine(); // consume leftover newline
        System.out.print("Enter usage date (YYYY-MM-DD): ");
        String dateInput = input.nextLine();
        
        // Parse the user's input string into a LocalDate object
        LocalDate date = LocalDate.parse(dateInput);

        household.recordUsage(fixture, date);
        // Assuming 'household' is your active Household object instance
        System.out.println("===== All Water Usage Records =====");

        // Use getter to obtain record list from household obj
        ArrayList<WaterUsageRecord> recordList = household.getRecords();

        // Use for loop to iterate over each index in the recordList arraylist, where each index contains a WaterUsageRecord Object
        for (int i = 0; i < recordList.size(); i++) {
        // Use ArrayList utilty method to obtain the WaterUsageRecord Objec
            WaterUsageRecord record = recordList.get(i);
        // Use date getter of WaterUsageRecord Object
            System.out.println("Date: " + record.getDate());
        // Use fixture object getter of WaterUsageRecord Object. then use name getter of fixture object
            System.out.println("Fixture: " + record.getFixture().getName());
        // Use litres  getter of WaterUsageRecord Object. 
            System.out.println("Water Consumed: " + record.getLitres() + " L\n");
        }
        input.close();
    }
}
