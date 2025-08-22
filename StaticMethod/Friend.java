package StaticMethod;

public class Friend {
    String name;
    static int numOfFriends = 0;

    Friend(String name) {
        this.name = name;
        numOfFriends += 1;
    }

    static void showFriends() {
        System.out.println("Total number of friends : " + numOfFriends);
    }
}
