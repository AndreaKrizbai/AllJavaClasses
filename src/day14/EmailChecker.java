package day14;

import java.util.Scanner;

public class EmailChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your email:");
        String email = scan.next();

        if(email.contains(" ") || ! email.contains("@")){
            System.out.println("Invalid email");
        } else if(email.endsWith("@gmail.com")){
            System.out.println("It is a gmail account");
        } else if(email.endsWith("@yahoo.com")) {
            System.out.println("It is a yahoo account");
        } else if(email.endsWith("@mail.ru")) {
            System.out.println("It is a Russian email account");
        }
    }
}
