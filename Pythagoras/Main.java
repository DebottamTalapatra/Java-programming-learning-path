package Pythagoras;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of Perpendicular:");
        double perpendicular = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the value of Base:");
        double base = scanner.nextDouble();
        scanner.nextLine();

        // Pythagoras's theorem
        double hypotenuse = Math.sqrt((Math.pow(perpendicular, 2) + Math.pow(base, 2)));

        System.out.println("The Hypotenuse comes out to be : " + hypotenuse);

        scanner.close();

    }
}
