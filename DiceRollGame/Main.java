package DiceRollGame;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the number of times you would like to roll the dice");
        int diceRoll = scanner.nextInt();
        scanner.nextLine();

        int rollSum = 0;

        for (int i = 1; i <= diceRoll; i++) {
            int roll = random.nextInt(1, 7);
            rollSum += roll;
            printRolledDice(roll);
            System.out.printf("You rolled a %d!\n", roll);
        }
        System.out.println("Your total:" + rollSum);
        scanner.close();
    }

    static void printRolledDice(int roll) {
        switch (roll) {
            case 1 -> System.out.println("""
                                    -------
                                    |     |
                                    |  ●  |
                                    |     |
                                    -------
                    """);
            case 2 -> System.out.println("""
                                    -------
                                    | ●   |
                                    |     |
                                    |    ●|
                                    -------
                    """);
            case 3 -> System.out.println("""
                                    -------
                                    |●    |
                                    |  ●  |
                                    |    ●|
                                    -------
                    """);
            case 4 -> System.out.println("""
                                    -------
                                    |●   ●|
                                    |     |
                                    |●   ●|
                                    -------
                    """);
            case 5 -> System.out.println("""
                                    -------
                                    |●   ●|
                                    |  ●  |
                                    |●   ●|
                                    -------
                    """);
            case 6 -> System.out.println("""
                                    -------
                                    |●   ●|
                                    |●   ●|
                                    |●   ●|
                                    -------
                    """);
        }
    }
}
