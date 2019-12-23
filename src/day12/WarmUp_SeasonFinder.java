package day12;

import java.util.Scanner;

public class WarmUp_SeasonFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the month (1-12)?");
        int month = scan.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
        } else if (month >= 3 && month <= 5) {
            System.out.println("It's spring!");
        } else if (month >= 6 && month <= 8) {
            System.out.println("It's summer!");
        } else if (month >= 9 && month <= 11) {
            System.out.println("It's fall!");
        } else {
            System.out.println("It's winter!");
        }
        //   } else if ( month == 1 || month == 2 || month == 12){
        //      System.out.println("It's winter!");
        //  }
    }
}
