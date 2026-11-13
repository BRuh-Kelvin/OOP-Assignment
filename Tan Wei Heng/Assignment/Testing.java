package Assignment;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter water flow rate (L/min): ");
        double flowRate = input.nextDouble();

        System.out.print("Enter shower time (min): ");
        double showerTime = input.nextDouble();

        WaterFixture fixture = new ShowerFixture(name, flowRate, showerTime);

        System.out.print(fixture.getName() + " " + ((ShowerFixture)fixture).getShowerTime() + " " + ((ShowerFixture)fixture).getWaterFlowRate());
    }
}
