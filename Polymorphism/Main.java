package Polymorphism;

public class Main {
    public static void main(String[] args) {

        // POLYMORPHISM ---> Objects can identify as other objects. Objects can be
        // treated as objects of a common superclass

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        // car.go();
        // bike.go();
        // boat.go();

        // Car[] vehicles = {car, bike, boat}...wrong because bike and boat do not
        // identify as Car
        // Bike[] vehicles = {car, bike, boat} ....wrong because car and boat does not
        // identify as bike
        // Boat[] vehicles = {car, bike, boat}...wrong because car and bike do not
        // identify as boat

        // so, they all identify as Vehicles. Thereby in the below format, no error.
        Vehicle[] vehicles = { car, bike, boat };

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}
