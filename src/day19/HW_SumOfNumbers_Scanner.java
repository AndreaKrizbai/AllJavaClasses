package day19;

import java.util.Scanner;

public class HW_SumOfNumbers_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter starting number:");
        int startNum = scan.nextInt();
        System.out.println("Please enter ending number:");
        int endNum = scan.nextInt();

        int sum = 0;

        for (int i = startNum; i <= endNum ; i++) {
            sum = sum + i;
 //           System.out.println(sum);
        }
        System.out.println("Sum of your range is: " + sum);

    }
}
