package day05;

import java.util.Scanner;

public class ScannerPractice2_TimeConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many days do you want to count?");
        int days = scan.nextInt();
        int mins = days * 1440;
        System.out.println(days + " day(s) equals to " + mins + " minutes.");
    }
}
