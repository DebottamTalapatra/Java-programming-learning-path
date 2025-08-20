package Methods;

public class Main {
    public static void main(String[] args) {
        happyBirthday("Debottam", 21);
        System.out.printf("The double of %f is %f.\n", 4.0, square(4));
        System.out.printf("The full Name is %s.\n", getFullName("Debottam", "Talapatra"));
    }

    static void happyBirthday(String name, int age) {
        System.out.printf("Happy birthday, %s ! You have turned %d.", name, age);
    }

    static double square(double number) {
        return number * number;
    }

    static String getFullName(String firstName, String secondName) {
        return firstName + " " + secondName;
    }
}
