package VarArgs;

public class Main {
    public static void main(String[] args) {
        add(2, 3);
        add(2, 3, 4);
        add(5, 6, 3, 2, 7);
    }

    static void add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
