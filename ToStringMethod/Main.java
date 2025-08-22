package ToStringMethod;

public class Main {
    public static void main(String[] args) {

        // .toString() = Method inherited from the object class. Used to return a string
        // representation of an object. By default it returns a hash code as a unique
        // identifier. It can be overridden to provide meaningful details.

        Car car1 = new Car("Ford", "Mustang", 2025, "Red");
        Car car2 = new Car("Chevrolet", "Corvette", 2026, "Blue");

        // gives memory address before overriding. BUt after overriding, does desired
        // job
        System.out.println(car1);
        System.out.println(car2);

    }

}
