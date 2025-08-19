package VariablesInJava;

public class Main {
    public static void main(String[] args) {
        /*
         * Primitive variables are simple values stored directyly in STACK(eg- int,
         * double, char,boolean)
         * 
         * Reference variables are memory addresses(in STACK) that points to the
         * HEAP(eg-string,array,object)
         */

        int age = 21;
        double marks = 98.34;
        char grade = 'A';

        boolean hasPassed = true;

        String name = "Debottam Talapatra";

        if (hasPassed) {
            System.out.println("The student has passed!");
        } else {
            System.out.println("The student has failed!");
        }

        System.out.println(
                "Hello there ! My name is " + name + ". I am " + age + " years of age and I have secured a marks of "
                        + marks + ", thereby securing a grade of " + grade + " in my class. Thank you !");

    }
}
