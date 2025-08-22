package SuperKeyword;

public class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void getFullName() {
        System.out.println(this.firstName + " " + this.lastName);
    }
}
