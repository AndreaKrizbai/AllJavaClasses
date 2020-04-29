package Practice.Repls;

import java.util.Scanner;

public class StringT3_Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your full name:");
        String fullName = scan.nextLine();
        int firstSpace = fullName.indexOf(" ");

        System.out.println("Your initials are: " + fullName.charAt(0) + fullName.charAt(firstSpace+1));
    }
}
