package StaticMethod;

public class Main {
    public static void main(String[] args) {

        // static = Makes a variable or method belong to the class rather than to any
        // specific object. Commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("Chandler");
        Friend friend2 = new Friend("Monica");
        Friend friend3 = new Friend("Rachel");
        Friend friend4 = new Friend("Ross");
        Friend friend5 = new Friend("Phoebe");

        Friend.showFriends();
    }
}
