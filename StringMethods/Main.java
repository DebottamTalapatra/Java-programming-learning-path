package StringMethods;

public class Main {
    public static void main(String[] args) {
        String name = "Debttam Talapatra";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("m");
        int lastIndex = name.lastIndexOf("t");

        String upperCase = name.toUpperCase();
        String lowerCase = name.toLowerCase();

        System.out.printf(
                "Your name is %d letters long. It starts with %c. The letter m has an index of %d in your name. The letter t has a last index of %d. Your name looks like %s in uppercase and %s in lowercase.\n",
                length, letter, index, lastIndex, upperCase, lowerCase);

        String sample = " Hey There!  ";
        System.out.printf(
                "The string %s is initially %d letters long.But after trimming, it becomes %s which is %d letters long.\n",
                sample, sample.length(), sample.trim(), sample.trim().length());

        String sample2 = "DOG";
        System.out.printf("Before mutation, the string is %s\n", sample2);
        sample2 = sample2.replace("D", "G");
        System.out.printf("After mutation, the string becomes %s.\n", sample2);

        // Similarly we also have <string_name>.contains("<xyz>") and
        // <string_name>.isEmpty() methods!

        // We also have <string_name>.equals(<string_being_compared to>) and
        // <string_name>.equalsIgnoreCase(<string_being_compared_to>)

    }
}
