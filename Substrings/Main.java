package Substrings;

public class Main {
    public static void main(String[] args) {
        String name = "Debottam Talapatra";
        int spaceIndex = name.indexOf(" ");
        String firstName = name.substring(0, spaceIndex);
        String lastName = name.substring(spaceIndex + 1, name.length());

        System.out.printf("Your fist name is %s. And your last name is %s\n", firstName, lastName);
    }
}
