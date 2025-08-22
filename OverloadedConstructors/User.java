package OverloadedConstructors;

public class User {
    String username;
    String email;
    int age;

    // Target: Creating a constructor that can create objects without all three
    // specified attributes

    User() {
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }

    User(String username) {
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }

    User(String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

}
