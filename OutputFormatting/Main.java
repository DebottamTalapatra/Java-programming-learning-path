package OutputFormatting;

public class Main {
    public static void main(String[] args) {

        // SPECIFIER CHARACTERS
        String name = "Debottam";
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s%n", name); // %s → String
        System.out.printf("Your name starts with a %c%n", 'D'); // %c → char
        System.out.printf("You are %d years old%n", age); // %d → integer
        System.out.printf("You are %f inches tall%n", height); // %f → floating-point
        System.out.printf("Employed: %b%n", isEmployed); // %b → boolean

        // PRECISION (.x = x decimal places)
        double price1 = 5.45;
        double price2 = 3.22;
        double price3 = 1.98;

        System.out.printf("Price1 = %.1f%n", price1);
        System.out.printf("Price2 = %.2f%n", price2);
        System.out.printf("Price3 = %.3f%n", price3);

        // FLAGS
        /*
         * + → always show plus/minus sign
         * , → comma separates thousands
         * ( → encloses negatives in parentheses
         * space → prints space for positives, minus for negatives
         */
        System.out.printf("With + flag  : %+.1f%n", 900.0);
        System.out.printf("With , flag  : %,.2f%n", 1092.0);
        System.out.printf("With ( flag  : %(.3f%n", -78.0); // works only with negatives

        // WIDTH & PADDING
        /*
         * %04d → pad with zeros (width = 4)
         * %-4d → left-justify (width = 4)
         */
        System.out.printf("Zero padded  : %04d%n", 900);
        System.out.printf("Zero padded  : %04d%n", 78);
        System.out.printf("Left padded  : %-4d<-%n", 78); // <- shows spaces
    }
}
