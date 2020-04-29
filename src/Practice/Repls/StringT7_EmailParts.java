package Practice.Repls;

import java.util.Scanner;

public class StringT7_EmailParts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your email address:");
        String email = scan.next();

        int indexOfAtSign = email.indexOf("@");
        int indexOfDot = email.lastIndexOf(".");

        if(!email.contains("@") || !email.contains(".")){
            System.out.println("Not a valid email");
        } else {
            System.out.println("Part1 -> " + email.substring(0,indexOfAtSign));
            System.out.println("Part2 -> " + email.substring(indexOfAtSign+1,indexOfDot));
            System.out.println("Part3 -> " + email.substring(indexOfDot+1));
        }
    }
}
