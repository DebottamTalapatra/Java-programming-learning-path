package JavaMadlibsGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO MY MADLIBS GAME!----------------");

        System.out.println("Enter the name of a celebrity:");
        String celebrity_name = scanner.nextLine();

        System.out.println("Enter the name of a gross foood:");
        String gross_food = scanner.nextLine();

        System.out.println("Enter an adjective:");
        String adjective = scanner.nextLine();

        System.out.println("Enter the name of any body part:");
        String body_part = scanner.nextLine();

        System.out.println("Enter a verb in the present tense(end with -ing):");
        String verb = scanner.nextLine();

        System.out.println("Enter a silly noise:");
        String silly_noise = scanner.nextLine();

        System.out.println("Last night, I went to dinner with " + celebrity_name + ". They ordered a plate of "
                + gross_food + ", which smelled " + adjective + ". Suddenly, they spilled it all over my " + body_part
                + " while " + verb + " loudly. The whole restaurant went quiet until someone in the back shouted, "
                + silly_noise + "!' I don’t think I’m going back there again.");

        scanner.close();
    }
}