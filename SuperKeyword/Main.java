package SuperKeyword;

public class Main {
    public static void main(String[] args) {

        // SUPER = Refers to the parent class(subclass <- superclass) ...Used in
        // constructors and method overriding
        // Calls the parent consructor to initialize attributes

        Person person = new Person("Harry", "Potter");
        Person person2 = new Person("Albus", "Dumbledore");

        Student student1 = new Student("Tom", "Riddle", 3.2);
        Student student2 = new Student("Hermoine", "Granger", 4.0);

        student1.viewStudentCredentials();
        student2.viewStudentCredentials();

        Employee emp = new Employee("John", "Doe", 30000);
        Employee emp2 = new Employee("Aurthur", "Miller", 60000);

        emp.showSalary();
        emp2.showSalary();

        person.getFullName();
        person2.getFullName();
        student1.getFullName();
        student2.getFullName();
        emp.getFullName();
        emp2.getFullName();

    }
}
