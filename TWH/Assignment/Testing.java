package TWH.Assignment;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        WaterFixture fixture = null;

        while (fixture == null) {
            try {
                System.out.print("Enter Name: ");
                String name = input.nextLine();

                System.out.print("Enter water flow rate (L/min): ");
                double flowRate = Double.parseDouble(input.nextLine().trim());

                fixture = new ShowerFixture(name, flowRate);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        double minute = -1;
        while (minute < 0) {
            try {
                System.out.print("Enter time (min): ");
                minute = Double.parseDouble(input.nextLine().trim());
                if (minute < 0)
                    System.out.println("Time cannot be negative.");
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
            }
        }

        System.out.println(fixture.getName() + ": " + fixture.calculateWaterUsage(minute) + " L");
        input.close();
    }
}
