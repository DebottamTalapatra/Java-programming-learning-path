package TakingInputs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // White spaces accepted. Strings of full names can be handled
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Welcome to the Java programming language, " + name);

        // Does not read white spaces. Accepts only a single word
        System.out.println("Enter your name again:");
        String name2 = scanner.next();
        System.out.println("Welcome yet again to the Java programming language, " + name2);

        scanner.nextLine();

        // Common issue

        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter a color:");
        String col = scanner.nextLine();

        System.out.println("The number is " + number + " and the color is " + col + ".");

        scanner.close();
    }
}
