package day11;

import java.util.Scanner;

public class LogicalOperators_Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        System.out.println(" ---- num >100 || num <10 ---- ");
        System.out.println(num >100 || num <10);
        System.out.println(" ---- num >10 && num < 60 ---- ");
        System.out.println(num >10 && num < 60);
        System.out.println(" ---- num == 50 || num == 51 || num == 55 ---- ");
        System.out.println(num == 50 || num == 51 || num == 55);
        System.out.println(" ---- num > 50 && num != 52 || num == 57 ---- ");
        System.out.println(num > 50 && num != 52 || num == 57);

        System.out.println( 5 > 10 && 9/0 == 3);
        System.out.println(10 > 5 || 9 / 0 == 3);
 //       System.out.println(10 > 5 | 9 / 0 == 3); --> will give error

 /*       if (num > 100 || num < 10){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (num > 10 && num < 60){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
   */ }
}
