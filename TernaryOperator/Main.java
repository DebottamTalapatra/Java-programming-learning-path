package TernaryOperator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature:");
        double temp = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Specify the unit of the temperature thus provided (C/F):");
        String unit = scanner.next();
        scanner.nextLine();

        double newTemp = (unit.equalsIgnoreCase("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.printf("The new temperature is: %.2f", newTemp);

        scanner.close();
    }
}
