package day31;

import java.util.Scanner;

public class Voting_WithScanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tell me your age: ");
        checkEligibility(scan.nextInt());
    }

    public static void checkEligibility(int age) {
        if (age > 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}
