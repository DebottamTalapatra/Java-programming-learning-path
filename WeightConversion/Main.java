package WeightConversion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO WEIGHT CONVERSION PROGRAM-------");
        System.out.println("Press 1 for Converting lbs to kgs");
        System.out.println("Press 2 for Converting kgs to lbs");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            // lbs to kgs
            System.out.println("Enter the weight in lbs");
            double lbsWeight = sc.nextDouble();
            sc.nextLine();

            double kgWeight = 0.45359237 * lbsWeight;

            System.out.printf("Your corresponding weight in kgs is %.3f\n", kgWeight);

        } else if (choice == 2) {
            // kgs to lbs
            System.out.println("Enter the weight in kgs");
            double kgWeight = sc.nextDouble();
            sc.nextLine();

            double lbsWeight = kgWeight / 0.45359237;

            System.out.printf("Your corresponding weight in lbs is %.3f\n", lbsWeight);
        } else {
            System.out.println("Invalid Choice");
        }
        sc.close();
    }
}
