package day12;

public class LoginTest {
    public static void main(String[] args) {

        String username = "user123", password = "pass123";

        if (username.equals("user123") && password.equals("pass123")) {
            System.out.println("Login successful!");
        } else if (!username.equals("user123") && password.equals("pass123")) {
            System.out.println("Username is not correct");
        } else if (username.equals("user123") && !password.equals("pass123")) {
            System.out.println("Password is not correct");
        } else {
            System.out.println("Username and password are both wrong");
        }


    }
}
