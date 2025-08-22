package QuizGame;

import java.util.Scanner;

public class Main {
    static String[] QUESTIONS = {
            "Who is known as the 'King of Rock and Roll'?",
            "Which band released the album 'Exile on Main St.'?",
            "Which city is considered the birthplace of grunge?",
            "Which band’s debut album was 'Appetite for Destruction'?",
            "Who was the lead singer of Nirvana?"
    };
    static String[] OPTIONS = {
            "A) Elvis Presley  B) Mick Jagger  C) Chuck Berry  D) Little Richard",
            "A) Pink Floyd  B) The Beatles  C) The Rolling Stones  D) Led Zeppelin",
            "A) Los Angeles  B) New York  C) Seattle  D) Chicago",
            "A) Metallica  B) Guns N' Roses  C) AC/DC  D) Aerosmith",
            "A) Chris Cornell  B) Kurt Cobain  C) Eddie Vedder  D) Layne Staley"
    };
    static String[] ANSWERS = {
            "A",
            "C",
            "C",
            "B",
            "B"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO THE QUIZ GAME! PRESS ENTER TO PROCEED...................");
        scanner.nextLine();
        int userScore = 0;

        for (int i = 0; i < QUESTIONS.length; i++) {
            System.out.println(QUESTIONS[i]);
            System.out.println(OPTIONS[i]);
            System.out.println("Choose the correct option----->");
            String userAnswer = scanner.next();
            scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(ANSWERS[i])) {
                userScore += 1;
                if (i != QUESTIONS.length - 1) {
                    System.out.println("CORRECT! Now the next question ---------------->");
                }
                continue;
            }
            System.out.println("INCORRECT! Now the next question ---------------->");
        }

        System.out.printf("YOUR SCORE IS : %d", userScore);
        scanner.close();
    }
}
