package day22;

import java.util.Scanner;

public class ScannerLoopArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int[]numbers = new int[3];
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("Enter your number " + (i+1));
            numbers[i] = scan.nextInt();
            sum = sum + numbers[i];
        }
        System.out.println("Sum of these numbers is: " + sum);
    }
}
