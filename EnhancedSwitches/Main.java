package EnhancedSwitches;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day of the week:");
        String dayInput = scanner.next();
        scanner.nextLine();

        switch (dayInput) {
            case "Monday" -> System.out.println("It is a weekday!");
            case "Tuesday" -> System.out.println("It is a weekday!");
            case "Wednesday" -> System.out.println("It is a weekday!");
            case "Thursday" -> System.out.println("It is a weekday!");
            case "Friday" -> System.out.println("It is a weekday!");
            case "Saturday" -> System.out.println("It is a weekend!!!!!!");
            case "Sunday" -> System.out.println("It is a weekend!!!!!!");
            default -> System.out.println("It is NOT  a day of the week....");
        }

        // or
        System.out.println("Enter another the day of the week:");
        String day = scanner.next();
        scanner.nextLine();

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday!");
            case "Saturday", "Sunday" -> System.out.println("It is a weekend!!!!!!");
            default -> System.out.println("It is NOT  a day of the week....");
        }
        scanner.close();
    }
}
