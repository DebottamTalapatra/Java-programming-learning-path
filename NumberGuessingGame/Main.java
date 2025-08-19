package NumberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int N = random.nextInt(1, 10);

        int guesses = 0;
        boolean numberGuessed = false;

        while (!numberGuessed) {
            System.out.println("Enter your guess !(between 1 and 10):");
            int number = scanner.nextInt();
            scanner.nextLine();

            guesses += 1;

            if (number == N) {
                numberGuessed = true;
                break;
            }
            System.out.println("Not quite! Try again ! You have so far guessed " + guesses + " times.");
        }

        System.out
                .println("CONGRATULATIONS! You have successfully guessed the number in " + guesses + " guesses total!");

        scanner.close();

    }
}
