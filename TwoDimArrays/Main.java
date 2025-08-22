package TwoDimArrays;

public class Main {
    public static void main(String[] args) {
        String[] fruits = { "apple", "orange", "banana" };
        String[] vegetables = { "potato", "onion", "carrot" };
        String[] meats = { "chicken", "pork", "beef", "fish" };

        String[][] groceries = { fruits, vegetables, meats };

        // OR
        // String[][] groceries = {
        // {"apple", "orange", "banana"},
        // {"potato", "onion", "carrot"}
        // {"chicken", "pork", "beef", "fish" }};

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}