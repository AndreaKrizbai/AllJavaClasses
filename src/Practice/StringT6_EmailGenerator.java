package Practice;

import java.util.Scanner;

public class StringT6_EmailGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first and last name:");
        String name = scan.nextLine();
        int firstSpace = name.indexOf(" ");

        String email = name.charAt(0) + name.substring(firstSpace+1) + "@NightWatch.com";
        System.out.println(email);
    }
}
