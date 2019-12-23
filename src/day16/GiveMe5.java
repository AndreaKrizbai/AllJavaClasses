package day16;

import java.util.Scanner;

public class GiveMe5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Gimme 5!!!");
        int userNumber = scan.nextInt();

 /*      if (userNumber!=5){
            System.out.println("Hey, you didn't gimme 5!");
        }
  */
       while (userNumber != 5){
           System.out.println("Gimme 5!!!");
           userNumber = scan.nextInt();
       }
        System.out.println("END OF PROGRAM");
    }
}
