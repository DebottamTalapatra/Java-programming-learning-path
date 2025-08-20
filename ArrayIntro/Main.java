package ArrayIntro;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] fruits = { "apple", "orange", "banana", "coconut" };

        Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");

        // looping using for loop
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        // loop otherwise
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
