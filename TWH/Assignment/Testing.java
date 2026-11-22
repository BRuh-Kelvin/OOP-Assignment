package TWH.Assignment;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter water flow rate (L/min): ");
        double flowRate = input.nextDouble();

        WaterFixture fixture = new ShowerFixture(name, flowRate);

        System.out.print(fixture.getName() + " " + " "
                + ((ShowerFixture) fixture).getWaterFlowRate());

        input.close();
    }
}
