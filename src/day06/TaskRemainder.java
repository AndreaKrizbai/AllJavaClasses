package day06;

import java.util.Scanner;

public class TaskRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter minutes:");
        int minutes = scan.nextInt();
        int minutesToHours = minutes / 60;
        int minuteRemainder = minutes % 60;
        System.out.println(minutes + " minutes is " + minutesToHours
                + " hour(s) and " + minuteRemainder + " minutes.");

    }
}
