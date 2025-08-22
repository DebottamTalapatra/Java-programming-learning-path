package Inheritance;

public class Main {
    public static void main(String[] args) {

        // INHERITANCE --> One class inherits the attributes and methods from another
        // class.
        // Child <- Parent
        // oe Child <- Parent <- Grandparent in case of multilevel inheritance

        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Is the dog alive?" + dog.isAlive);
        System.out.println("Is the cat alive?" + cat.isAlive);

        // same
        dog.eat();
        cat.eat();

        dog.speak();
        cat.speak();

        System.out.println("A dog has : " + dog.lives + " lives.");
        System.out.println("A cat has : " + cat.lives + " lives.");
    }
}
