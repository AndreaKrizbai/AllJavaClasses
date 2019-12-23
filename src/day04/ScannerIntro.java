package day04;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

   Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String firstName = scan.next();
        System.out.println("Nice to meet you, " + firstName);

        System.out.println("How old are you?");
        int age = scan.nextInt();
        System.out.println("That's pretty awesome! " + age +
                " is a cool age. Good for you!");

    }

}
