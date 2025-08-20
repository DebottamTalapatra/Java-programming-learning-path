package CalculatorProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double result = 0;

        System.out.println("Welcome to my simple calculator project!------");

        System.out.println("Enter the first number:");
        double firstNum = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter the operation to be performed(+,-,*,/,^):");
        char operation = sc.next().charAt(0);
        sc.nextLine();

        System.out.println("Enter the second number:");
        double secondNum = sc.nextDouble();
        sc.nextLine();

        boolean errorFlag = false;

        switch (operation) {
            case '+' -> result = firstNum + secondNum;
            case '-' -> result = firstNum - secondNum;
            case '*' -> result = firstNum * secondNum;
            case '/' -> {
                if (secondNum == 0) {
                    System.out.println("Division by zero is not possible!");
                    errorFlag = true;

                } else {
                    result = firstNum / secondNum;
                }
            }
            case '^' -> result = Math.pow(firstNum, secondNum);
            default -> {
                System.out.println("Invalid Choice !");
                errorFlag = true;
            }
        }

        if (!errorFlag) {
            System.out.printf("The result is %.2f.", result);
        }

        sc.close();
    }
}
