package JavaInterface;

public class Fish implements Prey, Predator {

    //Function overriding
    @Override
    public void flee() {
        System.out.println("The fish is swimming away!");
    }

    @Override
    public void hunt() {
        System.out.println("The fish is hunting!");
    }
}
