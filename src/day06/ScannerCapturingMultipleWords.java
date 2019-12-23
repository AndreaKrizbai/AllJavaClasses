package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your full name?");
        String fullName = scan.nextLine();
        System.out.println("Where do you live? (city, state)");
        String cityState = scan.nextLine();
        System.out.println("What is your street address?");
        String streetAddress = scan.nextLine();
        System.out.println("Which high school did you go to?");
        String highSchool = scan.nextLine();


        System.out.println("Your name is " + fullName + ", you live in " +
                cityState + ", your street address is " + streetAddress + " and your high school was " + highSchool + ".");

    }
}
