package SuperKeyword;

public class Student extends Person {
    double gpa;

    Student(String firstName, String lastName, double gpa) {
        super(firstName, lastName);
        this.gpa = gpa;
    }

    void viewStudentCredentials() {
        System.out.printf("%s has a gpa of %.2f\n", this.firstName, this.gpa);
    }
}
