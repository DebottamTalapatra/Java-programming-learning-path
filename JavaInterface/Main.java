package JavaInterface;

public class Main {
    public static void main(String[] args) {
        // INTERFACE --> A blueprint for a class that specifies a set of abstract
        // methods that implementing classes MUST define

        // Supports MULTIPLE INHERITANCE TYPE BEHAVIOUR

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();

        fish.flee();
        fish.hunt();
    }
}
