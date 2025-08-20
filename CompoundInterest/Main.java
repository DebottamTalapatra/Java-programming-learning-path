package CompoundInterest;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal;
        double amount;
        double rate;
        double years;
        double n;

        System.out.println("Enter the Principal amount:");
        principal = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter the rate of interest:");
        rate = sc.nextDouble() / 100.0;
        sc.nextLine();

        System.out.println("Enter the number of years:");
        years = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter the number of times compounded per year:");
        n = (double) sc.nextInt();
        sc.nextLine();

        amount = principal * Math.pow((1.0 + (rate / n)), (n * years));

        System.out.printf("The amount after %f years is: %+.2f ", years, amount);

        sc.close();
    }
}
