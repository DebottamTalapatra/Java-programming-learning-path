package BankingProgram;

import java.util.Scanner;

public class Main {

    static String PASSWORD = "PQRST";
    static String ACCOUNT_NUMBER = "123456789";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalAmount = 0;
        double depositAmount;
        double withdrawalAmount;

        System.out.println(
                "WELCOME TO A SIMPLE JAVA BANKING PROGRAM! Please authenticate yourself to continue further!----------------");

        System.out.println("Enter your accountNumber:");
        String accNo = scanner.next();
        scanner.nextLine();

        System.out.println("Enter your 5 letter password:");
        String pin = scanner.next();
        scanner.nextLine();

        if (!accNo.equals(ACCOUNT_NUMBER)) {
            System.out.println("User not found!");
            scanner.close();
            return;
        } else {
            if (!pin.equals(PASSWORD)) {
                System.out.println("Incorrect password!");
                scanner.close();
                return;
            }
        }

        boolean exitStatus = false;

        while (!exitStatus) {
            System.out.println("Press 1: Show Balance");
            System.out.println("Press 2: Deposit an amount");
            System.out.println("Press 3: Withdraw money");
            System.out.println("Press 4 to exit program!-------");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> System.out.printf("Your current account balance is: %04.2f\n", totalAmount);
                case 2 -> {
                    System.out.println("Enter the amount to be deposited:");
                    depositAmount = scanner.nextDouble();
                    totalAmount += depositAmount;
                    System.out.printf("Amount has been deposited. Your current balance is : %04.2f\n", totalAmount);
                }
                case 3 -> {
                    System.out.println("Enter the amount to be withdrawed:");
                    withdrawalAmount = scanner.nextDouble();
                    if (totalAmount - withdrawalAmount < 0) {
                        System.out.println("Insufficient balance! Try again later...");
                        break;
                    }
                    totalAmount -= withdrawalAmount;
                    System.out.printf("Amount has been withdrawn. Your current balance is : %04.2f\n", totalAmount);
                }
                case 4 -> exitStatus = true;
            }
        }

        scanner.close();

    }
}
