package Abstraction;

public class Main {
    public static void main(String[] args) {
        // ABSTRACTION --> Used to define abstract classes and methods. Abstraction is
        // the process of hiding implementation details and showing only the essential
        // features;

        // Abstract classes CANT'T be instantiated directly
        // Abstract classes can contain 'ABSTRACT methods' that can not be implemented
        // They can also contain 'CONCRETE methods'(implemented) which are inherited

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6, 7);

        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }

}
