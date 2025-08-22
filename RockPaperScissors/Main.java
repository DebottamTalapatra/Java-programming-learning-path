package RockPaperScissors;

import java.util.Scanner;
import java.util.Random;

public class Main {

    static boolean resultValidator(String USER_CHOICE, String COMP_CHOICE) {
        if ((USER_CHOICE.equalsIgnoreCase("ROCK") && COMP_CHOICE.equalsIgnoreCase("PAPER"))
                || ((USER_CHOICE.equalsIgnoreCase("ROCK")) && (COMP_CHOICE.equalsIgnoreCase("SCISSORS")))
                || ((USER_CHOICE.equalsIgnoreCase("PAPER")) && (COMP_CHOICE.equalsIgnoreCase("ROCK")))
                || ((USER_CHOICE.equalsIgnoreCase("SCISSORS")) && (USER_CHOICE.equalsIgnoreCase("PAPER")))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("WELCOME TO MY JAVA ROCK, PAPER, SCISSORS GAME. PRESS enter to begin!------------");
        scanner.nextLine();

        System.out.println("Enter how many rounds you would like to play for: ");
        int userRounds = scanner.nextInt();

        int SCORE = 0;

        String userChoice;
        int computerChoice;
        String[] compArray = { "ROCK", "PAPER", "SCISSORS" };

        for (int i = 0; i < userRounds; i++) {
            System.out.println("Enter your choice ! (ROCK/PAPER/SCISSORS):");
            userChoice = scanner.next();
            scanner.nextLine();

            computerChoice = random.nextInt(0, 3);

            System.out.println("You chose: " + userChoice);
            System.out.println("Computer chose: " + compArray[computerChoice]);

            // game logic
            if (userChoice.equalsIgnoreCase((compArray[computerChoice]))) {
                System.out.println("DRAW ROUND...");
                continue;
            }
            boolean result = resultValidator(userChoice, compArray[computerChoice]);
            if (result) {
                SCORE += 10;
                System.out.println("YOU WIN THIS ROUND!");
            } else {
                System.out.println("YOU LOSE THIS ROUND!");
            }

            System.out.println("xxxxxxxxxxxxxxxxxxxxxx");
        }

        System.out.printf("GAME OVER ! YOUR SCORE IS %d OUT OF %d .", SCORE, (userRounds * 10));

        scanner.close();
    }
}
